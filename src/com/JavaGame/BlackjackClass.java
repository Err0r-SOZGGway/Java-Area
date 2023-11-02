package com.JavaGame;

import java.util.Scanner;

/**
 * CLIで動かすブラックジャックプログラム
 * @author S.W.
 * @version 1.0.0
 */
public class BlackjackClass {
	
	public static boolean gameFlag = true;
	
	public static void main(String[] args) {
	
		
	Scanner sc = new Scanner(System.in);
	
	// playerとdealerのuserDrawメソッドの実行とdeckCountの増加処理をメソッドでまとめる
	while (gameFlag) {
		
		Player player = new Player();
		Dealer dealer = new Dealer();
		Deck deck = new Deck();
		
		System.out.println("ゲームを開始します");
		// 山札をシャッフル
		deck.shuffleDeck(deck.getDeckList());
		
		// deckListからプレイヤー・ディーラーがカードを2枚引く	
		// なんかキモイソースになってしまったのでもう少しスマートにしたい
		// userDrawメソッドが呼び出される度にdeckCountを+1させたい
		player.userDraw(deck.getDeckList(), deck.getDeckCount());
		deck.setDeckCount(deck.getDeckCount() + 1);
		dealer.userDraw(deck.getDeckList(), deck.getDeckCount());
		deck.setDeckCount(deck.getDeckCount() + 1);
		player.userDraw(deck.getDeckList(), deck.getDeckCount());
		deck.setDeckCount(deck.getDeckCount() + 1);
		dealer.userDraw(deck.getDeckList(), deck.getDeckCount());
		deck.setDeckCount(deck.getDeckCount() + 1);
		
		// deckCount取得確認用
		// 山札の進行状況を記録する変数deckCountが4
//		System.out.println(deck.getDeckCount());
		
		// playerのHands取得確認用
		// プレイヤーの手札枚数を記録する変数playerHandsが2
//		System.out.println(player.getHands());
		
		// プレイヤー・ディーラーの手札のポイントを表示
		System.out.println("あなたの" + (player.getHands() - 1) + "枚目のカードは" + player.toDescription(player.getCardList().get(0)));
		
		System.out.println("ディーラーの" + (dealer.getHands() - 1) + "1枚目のカードは" + dealer.toDescription(dealer.getCardList().get(0)));
		
		System.out.println("あなたの" + player.getHands() + "枚目のカードは" + player.toDescription(player.getCardList().get(1)));
		
		System.out.println("ディーラーの" + dealer.getHands() + "枚目のカードは伏せられています");
		
		// プレイヤーのポイントを集計
		player.setPoint(player.sumPoint(player.getCardList()));
		System.out.println("あなたの現在のポイントは"+player.getPoint()+"です。");
		
		// ディーラーのポイントを集計
		dealer.setPoint(dealer.sumPoint(dealer.getCardList()));
		
		// プレイヤーがカードを引くフェーズ
		player.playerDraw(deck.getDeckList(), deck.getDeckCount());
		deck.setDeckCount(deck.getDeckCount() + 1);
		
		if (player.isBust()) {
			// プレイヤーの負けとしてゲームを終了
			// もう一度遊ぶか文を表示して、yかnの入力を受け付ける
			System.out.println("あなたのポイント："+player.getPoint());
			System.out.println("ディーラーのポイント："+dealer.getPoint());
			System.out.println("YOU LOSE...");
			
			System.out.println();
			
			gameEnd();
			
			if (gameFlag) {
				continue;
			} else {
				break;
			}
		} else {
			// ディーラーが手札を17以上にするまでカードを引くフェーズ
			dealer.dealerDraw(deck.getDeckList(), deck.getDeckCount());
			deck.setDeckCount(deck.getDeckCount() + 1);
			
			System.out.println("あなたのポイント："+player.getPoint());
			System.out.println("ディーラーのポイント："+dealer.getPoint());
			
			if (dealer.isBust()) {
				// プレイヤーの勝ちとしてゲームを終了
				// もう一度遊ぶか文を表示して、yかnの入力を受け付ける
				System.out.println("YOU WIN!");
				
				System.out.println();
				
				gameEnd();
				if (gameFlag) {
					continue;
				} else {
					break;
				}
			}
			
			// ポイントを比較する
			if (player.getPoint() == dealer.getPoint()) {
				System.out.println("DROW");
			} else if (player.getPoint() > dealer.getPoint()) {
				System.out.println("YOU WIN!");
			} else {
				System.out.println("YOU LOSE...");
			}
			
			System.out.println();
			
			gameEnd();
			if (gameFlag) {
				continue;
			} else {
				break;
			}
			}
		}
	}
	
	private static void gameEnd() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("もう一度遊びますか？yかnを入力して下さい。 Yes:y or No:n");
		
		try {
			String gameContinue = sc.nextLine();
			if ("n".equals(gameContinue)) {
				System.out.println("ゲームを終了します");
				gameFlag = false;
			} else if("y".equals(gameContinue)) {
				gameFlag = true;
			}
		} catch (Exception e) {
			System.out.println("無効な入力です。yかnを入力して下さい。");
		}
	}
}
