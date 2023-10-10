package com.JavaGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BlackjackClass {

	public static void main(String[] args) {
		
		int playerPoint = 0;
		int dealerPoint = 0;
		
		System.out.println("ゲームを開始します");
		// 空の山札を作成
		List<Integer> deck = new ArrayList<Integer>();
		// 山札をシャッフル
		shuffleDeck(deck);
		
		// プレイヤー・ディーラーの手札リストを生成
		List<Integer> player = new ArrayList<Integer>();
		List<Integer> dealer = new ArrayList<Integer>();
		
		// プレイヤー・ディーラーがカードを2枚引く
		player.add(deck.get(0));
		dealer.add(deck.get(1));
		player.add(deck.get(2));
		dealer.add(deck.get(3));
		
		// 山札の進行状況を記録する変数deckCountを定義
		int deckCount = 4;
		
		// プレイヤーの手札枚数を記録する変数playerHandsを定義
		int playerHands = 2;
		
		// プレイヤー・ディーラーの手札のポイントを表示
		System.out.println("あなたの1枚目のカードは"+toDescription(player.get(0)));
		
		System.out.println("ディーラーの1枚目のカードは"+toDescription(dealer.get(0)));
		
		System.out.println("あなたの2枚目のカードは"+toDescription(player.get(1)));
		
		System.out.println("ディーラーの2枚目のカードは伏せられています");
		
		// プレイヤー・ディーラーのポイントを集計
		playerPoint=sumPoint(player);
		System.out.println("あなたの現在のポイントは"+playerPoint+"です。");
		dealerPoint=sumPoint(dealer);
		
		// プレイヤーがカードを引くフェーズ
		while (true) {
			System.out.println("カードを引きますか？Yes:y or No:n");
			// キーボードの入力を受け付けて、変数strに代入する
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			
			if("n".equals(str)) {
				break;
			}else if("y".equals(str)) {
				// 手札に山札から1枚加える
				player.add(deck.get(deckCount));
				
				// 山札と手札を1枚進める
				deckCount++;
				playerHands++;
				System.out.println("あなたの3枚目のカードは" + toDescription(player.get(playerHands - 1)) + "です");
				playerPoint = sumPoint(player);
				System.out.println("あなたの現在のポイントは"+playerPoint+"です。");
				
				// プレイヤーのバーストチェック
				if (isBusted(playerPoint)) {
					System.out.println("残念、バーストです。");
					return;
				}
			}else {
				System.out.println("あなたの入力は"+str+"です。yかnを入力して下さい。");
			}
			
		}
		
		// ディーラーが手札を17以上にするまでカードを引くフェーズ
		while (true) {
			// 手札が17以上の場合break
			if (dealerPoint >= 17) {
				break;
			} else {
				// 手札に山札から1枚加える
				dealer.add(deck.get(deckCount));
				// 山札を1枚進める
				deckCount++;
				// ディーラーの合計ポイントを計算
				dealerPoint = sumPoint(dealer);
				
				// ディーラーのバーストチェック
				if (isBusted(dealerPoint)) {
					System.out.println("ディーラーがバーストしました。");
					return;
				}
			}
		}
		
		System.out.println("あなたのポイント："+playerPoint);
		System.out.println("ディーラーのポイント："+dealerPoint);
		
		// ポイントを比較する
		if (playerPoint == dealerPoint) {
			System.out.println("DROW");
		} else if (playerPoint > dealerPoint) {
			System.out.println("YOU WIN!");
		} else {
			System.out.println("YOU LOSE...");
		}
		
	}

	// 山札（deck）に値を入れ、シャッフルする
	private static void shuffleDeck(List<Integer> deck) {
		// リストに1から52の連番を代入
		// for文でaddメソッドを使ってもいい
//		deck = IntStream.range(1, 52).boxed().collect(Collectors.toList());
		for (int i=1;i<=52;i++) {
			deck.add(i);
		}

		// 山札をシャッフル
		Collections.shuffle(deck);

		// リストの中身を確認（デバッグ用）
//		for (int i = 0; i < deck.size(); i++) {
//			System.out.println(deck.get(i));
//		}
	}

	// 手札がバーストしているか判定する
	private static boolean isBusted(int point) {
		
		if (point <= 21) {
			return false;
		} else {
			return true;
		}

	}

	// 現在の合計ポイントを計算する
	private static int sumPoint(List<Integer> list) {
		int sum = 0;
		//		仮のコード
		//		sum = list.stream().mapToInt(Integer::intValue).sum();
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

	// 山札の数を「スート」の「ランク」の文字列に置き換える
	private static String toDescription(int cardNumber) {
		String rank = toRank(toNumber(cardNumber));
		String suit = toSuit(cardNumber);

		return suit + "の" + rank;
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

}
