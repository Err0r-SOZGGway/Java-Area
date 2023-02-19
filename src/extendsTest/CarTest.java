package extendsTest;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();
		car.drive(20);
		car.drive(30);
		car.putGas(40);
		car.checkGas();
		
		System.out.println("");
		
		EconomyCar eCar = new EconomyCar();
		eCar.drive(20);
		eCar.drive(30);
		eCar.putGas(40);
		eCar.checkGas();
		
		System.out.println("");
		
		Programmer programmer1 = new Programmer("うぇーい"); // 引数あり
		Programmer programmer2 = new Programmer(); // 引数なし
	}

}
