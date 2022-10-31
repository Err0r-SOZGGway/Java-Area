import java.util.Scanner;

public class Shop {

	public static void main(String[] args) {
		System.out.println("金額を入力してください");
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		
		System.out.println("定価：" + price + "円");
		int amount = (int)(price * 1.10);
		System.out.println("税込み金額は、" + amount + "円です。");
		int discountPrice = (int)(amount * 0.8);
		System.out.println("20%割引した価格は、税込み" + discountPrice + "円です。");

	}

}
