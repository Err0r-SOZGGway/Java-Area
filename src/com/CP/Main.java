package com.CP;

public class Main {

	public static void main(String[] args) {
		 // オブジェクトの練習
		 Greeting hello = new Greeting();
		 Calculation test = new Calculation();
		 hello.sayHello();
		 test.cal();
		 
		 test.num();  // 継承の練習
		 
		 hello.sayGoodbye();
		 if(true) {
			 hello.sayGoodbye();
		 }
	}
}

class Greeting {
	public String msg;
	public Greeting() {
		msg = "Thank you!";
	}
	
	public void sayHello() {
		System.out.println("Hello World!");
	}
	public void sayGoodbye() {
		System.out.println("Goodbye!");
	}
}

class Calculation extends Greeting {
	public void cal() {
		int a = 100;
		int b = 50;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
	}
	
	public void num() {
		int c = 200;
		System.out.println(msg + c);
	}
}