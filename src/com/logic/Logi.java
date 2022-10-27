package com.logic;

public class Logi {

	public static void main(String[] args) {
		double rand = (Math.random() * 100) + 1;
		int number = (int)rand;
		System.out.println("あなたの点数は" + number + "点です");
		
		boolean flag = number >= 60;
		if (flag) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}

	}

}
