package info.test;

public class Human {
	private static int count_Human = 0;
	String name;
	int birthday;
	int manpukudo;
	
	public static int getCount_Human() {
		return count_Human;
	}

	public static void setCount_Human(int count_Human) {
		Human.count_Human = count_Human;
	}

	Human(String name, int birthday, int manpukudo) { // コンストラクタ1
		this.name = name;
		this.birthday = birthday;
		this.manpukudo = manpukudo;
		count_Human++;
	}

	Human(String name, int birthday) { // コンストラクタ2
		this(name, birthday, 50);
	}

	Human(String name) { // コンストラクタ3
		this(name, 0, 50);
	}

	Human() { // コンストラクタ4
		//		this.name = "不明";
		//		this.birthday = 0;
		//		this.manpukudo = 50;
		this("不明", 0, 50);
	}

	void eat() {
		this.manpukudo += 60;
	};
}
