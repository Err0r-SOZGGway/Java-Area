package extendsTest;

public class Programmer extends Human{
	Programmer(String s) {
		super(s);
		System.out.println("プログラマー誕生");
	}
	
	 Programmer() {
		this("");
	}
}
