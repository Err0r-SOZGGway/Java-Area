package extendsTest;

public class Car {
	int Gas = 60;
	int nenpi = 10;
	
	// Gasを消費して走る
	public void drive(int Gas) {
		this.Gas -= Gas;
		System.out.println(Gas * this.nenpi + "km走りました");
	}
	
	// Gasを補給する
	public void putGas(int Gas) {
		this.Gas += Gas;
		System.out.println("ガソリンを" + Gas + "リットル補給しました");
	}
	
	// 現在のGasの値を出力する
	public void checkGas() {
		System.out.println("ガソリンは残り" + this.Gas + "リットルです");
	}
}
