package info.test;

public class EclTest {

	public static void main(String[] args) {
		int x;
		x = 26;
		System.out.println(x);

		String y;
		y = "おはよう";
		System.out.println(y);

		int x1 = 10;
		x = x + x1;
		System.out.println(x);
		x = x * x1;
		System.out.println(x);
		// if文
		if (x > 100) {
			System.out.println(x + "は100以上");
		}

		String y1 = "ございます";
		System.out.println(y + y1);

		// 型変換
		String a;
		a = String.valueOf(x);
		System.out.println(a + y);

		String z = "10";
		int z1;
		z1 = Integer.parseInt(z);
		String Z = "5";
		int z2;
		z2 = Integer.parseInt(Z);
		System.out.println(z1 + z2);
		if (z1 < z2) {
			System.out.println(z2 + "の方が" + z1 + "より大きい");
		} else if (z1 == z2) {
			System.out.println(z2 + "と" + z1 + "は同じ");
		} else {
			System.out.println(z1 + "の方が" + z2 + "より大きい");
		}

		// for文、break
		int sum = 0;
		int i = 0;
		for (i = 1; i <= 10; i++) {
			sum += i;
			System.out.println(i + ":途中合計" + sum);
			if (sum > 30) {
				break;
			}
		}
		System.out.println("合計：" + sum);
		System.out.println("30を超えたのは？：" + i);
		
		// 配列
		String name[] = new String[3];
		double height[] = new double[3];
		name[0] = "山田";
		name[1] = "田中";
		name[2] = "鈴木"; 
		height[0] = 170.2;
		height[1] = 183.2;
		height[2] = 175.7;
		for (int j = 0; j <= 2; j++) {
		System.out.println(name[j] + ":" + height[j] + "cm");
		}
		// 拡張for文
		for(String k : name) {
			System.out.println(k);
		}
	}

}
