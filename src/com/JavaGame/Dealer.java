package com.JavaGame;

import java.util.List;

/**
 *  ディーラーの処理を制御
 * @author S.W.
 * @version 1.0.0
 */
public class Dealer extends PlayerBase {
	
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
					System.out.println("21になりました。");
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
