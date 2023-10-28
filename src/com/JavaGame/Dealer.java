package com.JavaGame;

import java.util.List;

public class Dealer extends PlayerBase {
		
//	private int dealerPoint;
//	
//	private int dealerHands;
//	
//	private boolean dealerBust;
//	
//	private List<Integer> dealerCardList;
	
	public Dealer() {
		setPoint(0);
		setHands(0);
		setBust(false);
	}
	
	public void dealerDraw(List<Integer> deck, int deckCount) {
				
		while (true) {
			// 手札が17以上の場合break
			if (getPoint() >= 17) {
				break;
			} else {
				userDraw(deck);
				System.out.println("ディーラーの" + getHands() + "枚目のカードは" + toDescription(cardList.get(getHands() - 1)) + "です");
				System.out.println("ディーラーの現在のポイントは"+getPoint()+"です。");
				
				// ポイントが21ならループを抜ける
				if(getPoint() == 21) {
					System.out.println("ブラックジャック！！");
					break;
				}
				
				// ディーラーのバーストチェック
				if (isBusted(getPoint())) {
					setBust(true);
					System.out.println("ディーラーがバーストしました。");
					break;
				}
				
			}
		}
	}	
}
