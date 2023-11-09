package com.JavaGame;

import java.util.ArrayList;
import java.util.List;


/**
 *  ブラックジャックのプレイヤーのベースとなるオブジェクト
 * @author S.W.
 * @version 1.0.0
 */
public class PlayerBase {
	
		// プレイヤーのポイント
		private int point;
	
		// 手札の枚数
		private int hands;
	
		// バーストかどうか判定
		private boolean bust;
		
		// Aを持っているかどうかの判定
		private static boolean aCardHold;
		
		// チップの枚数
		private int chip;
	
		// 手札
		List<Integer> cardList = new ArrayList<Integer>();
		
		Deck deck = new Deck();
	
		// 山札からカードを引く
		public void userDraw(List<Integer> deckList, int deckCount) {		
			// drawメソッドでdeckから得た値をcardListに加える
			cardList.add(deck.deckCardDraw(deckList, deckCount));
			deckCount++;
			hands++;
			point = sumPoint(cardList);
			// Aを持っているかつ点数が11点数以下の場合、Aを11として点数に10点足す
			// 計算の得点を計算するときにこの処理を追加する
			if (isaCardHold() && point <= 11) {
				point += 10;
			}
		}
		
		public void userDraw(List<Integer> deckList) {
			cardList.add(deck.cardDraw(deckList));
			hands++;
			point = sumPoint(cardList);
		}
	
		// 山札の数を「スート」の「ランク」の文字列に置き換える
		public String toDescription(int cardNumber) {
			String rank = toRank(toNumber(cardNumber));
			String suit = toSuit(cardNumber);

			return suit + "の" + rank;
		}
			
		// 現在の合計ポイントを計算する
		public int sumPoint(List<Integer> list) {
			int sum = 0;
			
			for (int i = 0; i < list.size(); i++) {
				sum += toPoint(toNumber(list.get(i)));
			}
			return sum;
		}
			
		// 山札の通し番号を得点計算用のポイントに変換する
		// J/Q/Kは10とする
		private static int toPoint(int num) {

			if (num == 11 || num == 12 || num == 13) {
				num = 10;
			}

			return num;
		}
			
		// 山札の数をカードの数に置き換える
		private static int toNumber(int cardNumber) {
			int number = cardNumber % 13;

			if (number == 0) {
				number = 13;
			}

			return number;
		}

		// カード番号をランク（AやJ,Q,K）に変換する
		private static String toRank(int number) {
			switch (number) {
			case 1:
				aCardHold = true;
				return "A";
			case 11:
				return "J";
			case 12:
				return "Q";
			case 13:
				return "K";
			default:
				String str = String.valueOf(number);
				return str;
			}
		}

		// 山札の数をスート（ハートやスペードなどのマーク）に置き換える
		private static String toSuit(int cardNumber) {

			switch ((cardNumber - 1) / 13) {
			case 0:
				return "クラブ";
			case 1:
				return "ダイヤ";
			case 2:
				return "ハート";
			case 3:
				return "スペード";
			default:
				return "例外です";
			}
		}
			
		// 手札がバーストしているか判定する
		public static boolean isBusted(int point) {
			
			if (point <= 21) {
				return false;
			} else {
				return true;
			}

		}

		public int getPoint() {
			return point;
		}

		public void setPoint(int point) {
			this.point = point;
		}

		public int getHands() {
			return hands;
		}

		public void setHands(int hands) {
			this.hands = hands;
		}

		public boolean isBust() {
			return bust;
		}

		public void setBust(boolean bust) {
			this.bust = bust;
		}

		public boolean isaCardHold() {
			return aCardHold;
		}

		public void setaCardHold(boolean aCardHold) {
			this.aCardHold = aCardHold;
		}
		
		public int getChip() {
			return chip;
		}

		public void setChip(int chip) {
			this.chip = chip;
		}

		public List<Integer> getCardList() {
			return cardList;
		}

		public void setCardList(List<Integer> cardList) {
			this.cardList = cardList;
		}
		
		
}
