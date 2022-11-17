package com.exPrc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String[] employee = {"山田太郎", "佐藤一郎", "月ノ美兎", "ときのそら" , "ジョン・タイター"};
		
		try (Scanner sc = new Scanner(System.in)) {
			int number = Integer.parseInt(sc.next());
			System.out.println(employee[number] + "さんを認証しました。");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("0から" + (employee.length - 1) + "を入力してください。");
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("数値を入力してください。");
			e.printStackTrace();
		} finally {
			System.out.println("ようこそ");
		}
	}

}
