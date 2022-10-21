package com.Github;

public class Calculation {

	public static void main(String[] args) {
		int Meat_Price = (int)(Math.random() * 5 + 2);
		int Meat_Num = (int)(Math.random() * 1200 + 100);
		System.out.println("1g当たりのお肉の単価：" + Meat_Price + "円");
		System.out.println("お肉を買う量：" + Meat_Num + "g");
		
		int total = Meat_Price * Meat_Num;
		System.out.println("合計金額：" + total + "円");
		// テスト用
		//System.out.println(total / Meat_Num);
	}

}
