package com.hashm;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap<String, String> positionMap = new HashMap<String, String>();
		positionMap.put("アルバイト", "ジョン・ドゥ");
		positionMap.put("契約社員", "四月一日太郎");
		positionMap.put("派遣社員", "嘉門達夫");
		positionMap.put("正社員", "吉良吉影");
		
		System.out.println(positionMap.get("アルバイト"));
		System.out.println(positionMap.get("正社員"));
		
		positionMap.put("正社員", "川尻浩作");
		System.out.println(positionMap.get("正社員"));
		
		System.out.println("----------");
		
		sub test = new sub();
		test.IntHash();
		
	}
}

class sub {

	public void IntHash(){
	HashMap<String, Integer> statusMap = new HashMap<String, Integer>();
	statusMap.put("HP", 60);
	statusMap.put("こうげき", 45);
	statusMap.put("ぼうぎょ", 70);
	statusMap.put("とくこう", 45);
	statusMap.put("とくぼう", 90);
	statusMap.put("すばやさ", 95);
	
	System.out.println(statusMap.get("HP"));
	System.out.println(statusMap.get("すばやさ"));
	}

}
