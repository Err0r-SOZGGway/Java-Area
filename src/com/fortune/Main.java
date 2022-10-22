package com.fortune;

public class Main {

	public static void main(String[] args) {
		int Number = (int)(Math.random() * 5 + 1);
		System.out.println("おみくじを引きました");
		
		if (Number == 1) {
			System.out.println("大吉");
		} else if (Number == 2) {
			System.out.println("中吉");
		} else if (Number == 3) {
			System.out.println("吉");
		} else if (Number == 4) {
			System.out.println("凶");
		} else {
			System.out.println("大凶");
		}

	}

}
