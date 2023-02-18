package info.test;

public class Human {
	private static int count_Human = 0;
	private String name;
	private int birthday;
	private int manpukudo;

	public static int getCount_Human() {
		return count_Human;
	}

	public static void setCount_Human(int count_Human) {
		Human.count_Human = count_Human;
	}

	public String getName() {
		return name;
	}

	public int getBirthday() {
		return birthday;
	}

	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}

	public int getManpukudo() {
		return manpukudo;
	}

	public boolean eat() {
		boolean result = false;
		if(this.manpukudo<100) {
			this.manpukudo += 60;
			if (this.manpukudo > 100) {
				this.manpukudo = 100;
			}
			result = true;
		}
		return result;
	};

	public boolean walk() {
		boolean result = false;
		if(this.manpukudo>0) {	
			this.manpukudo -= 10;
			if (this.manpukudo < 0) {
				this.manpukudo = 0;
			}
			result = true;
		}
		return result;
	}

	public boolean run() {
		boolean result = false;
		if(this.manpukudo>0) {
			this.manpukudo -= 20;
			if (this.manpukudo < 0) {
				this.manpukudo = 0;
			}
			result = true;
		}
		return result;
	}

	public void setName(String name) {
		if (name.length() <= 10) {
			System.out.println(this.name + "を " + name + "に変更しました");
			this.name = name;
		} else {
			System.out.println("名前は10文字までにしてください");
		}
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

}
