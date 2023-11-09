package com.JavaGame;

import java.util.List;
import java.util.Scanner;

/**
 * プレイヤーの処理を制御
 * @author S.W.
 * @version 1.0.0
 */

public class Player extends PlayerBase{
	
	public void playerDraw(List<Integer> deck, int deckCount) {
		
		try {
			while (true) {
				System.out.println("カードを引きますか？yかnを入力して下さい。 Yes:y or No:n");
				// キーボードの入力を受け付けて、変数strに代入する
				Scanner sc = new Scanner(System.in);
				String str = sc.nextLine();
				
				if("n".equals(str)) {
					break;
				}else if("y".equals(str)) {
					userDraw(deck);
					System.out.println("あなたの" + getHands() + "枚目のカードは" + toDescription(cardList.get(getHands() - 1)) + "です");
					System.out.println("あなたの現在のポイントは"+getPoint()+"です。");
					
					// ポイントが21ならループを抜ける
					if(getPoint() == 21) {
						System.out.println("21になりました。");
						break;
					}
					
					// プレイヤーのバーストチェック
					if (isBusted(getPoint())) {
						setBust(true);
						System.out.println("残念、バーストです。");
						break;
					}
				}else {
					throw new Exception("無効な入力です。");
				}
			}
		} catch (Exception e) {
			System.out.println("無効な入力です。yかnを入力して下さい。");
		}
		
	}	
}

