package extendsTest;

public class EconomyCar extends Car {
	int nenpi = 20;
	
	// 継承によるフィールドの隠蔽により、非推奨
//	@Override
//	public void drive(int Gas) {
//		this.Gas -= Gas;
//		System.out.println(Gas * this.nenpi + "km走りました");
//	}
}
