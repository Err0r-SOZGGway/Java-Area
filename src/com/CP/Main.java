package com.CP;

public class Main {

	public static void main(String[] args) {
		 Greeting hello = new Greeting();
		 Calculation test = new Calculation();
		 hello.sayHello();
		 test.cal();
		 hello.sayGoodbye();
		 if(true) {
			 hello.sayGoodbye();
		 }
	}
}

class Greeting {
	public void sayHello() {
		System.out.println("Hello World!");
	}
	public void sayGoodbye() {
		System.out.println("Goodbye!");
	}
}

class Calculation {
	public void cal() {
		int a = 100;
		int b = 50;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
	}
}