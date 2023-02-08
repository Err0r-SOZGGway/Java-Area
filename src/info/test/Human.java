package info.test;

public class Human {
	String name;
	int birthday;
	int manpukudo;
	
	Human(String name, int birthday ){
		this.name = name;
		this.birthday = birthday;
		this.manpukudo = 50;
	}
	
	Human(){
//		this.name = "不明";
//		this.birthday = 0;
//		this.manpukudo = 50;
		this("不明", 0);
	}
	
	void eat() {
		this.manpukudo += 60;
	};
}
