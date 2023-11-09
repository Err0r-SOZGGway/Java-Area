package com.JavaGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *  ブラックジャックの手札を制御する
 * @author S.W.
 * @version 1.0.0
 */
public class Deck {
	
	// 山札の進行状況を記録
	private int deckCount;
	
	// 山札のリスト
	private List<Integer> deckList = new ArrayList<Integer>(52);
	
	public Deck() {
		setDeckCount(0);;
	}
	
	public void shuffleDeck(List<Integer> deck) {
		// listを初期化したい（nullにするとぬるぽの原因になる）
		
//        リストに1から52の連番を代入
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
	
	// カードを引く処理
	public int deckCardDraw(List<Integer> deck, int deckCount) {
		// 山札からカードを1枚取得
		// getDeckCountだとIndexOutで例外を吐いてしまう
		int card = deck.get(deckCount);
		// 山札を1枚進める
		deckCount++;
		return card;
	}
	
	public int cardDraw(List<Integer> deck) {
		// 山札からカードを1枚取得
		// getDeckCountだとIndexOutで例外を吐いてしまう
		int card = deck.get(deckCount);
		// 山札を1枚進める
		deckCount++;
		return card;
	}
	
	public int getDeckCount() {
		return deckCount;
	}

	public void setDeckCount(int deckCount) {
		this.deckCount = deckCount;
	}

	public List<Integer> getDeckList() {
		return deckList;
	}

	public void setDeckList(List<Integer> deck) {
		this.deckList = deck;
	}
	
}
