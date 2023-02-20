package conOpe;

public class Main {

	public static void main(String[] args) {
		int num = 5;
		String result = "";

		// if文
		if (num > 10) {
			result = "numは10より大きいです";
		} else {
			result = "numは10以下です";
		}

		System.out.println(result);

		// 三項演算子
		num += 5;

		result = (num == 10) ? "numは10です" : "numは10以外です";

		System.out.println(result);

	}

}
