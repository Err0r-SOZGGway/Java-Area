package interfaceTest;

interface Flyable{
	void fly();
}

class Human implements Flyable{
	String name;
	Human(String name){
		this.name = name;
	}
	
	public void fly() {
		System.out.println(this.name + "は空高く飛んだ！");
	}
}

public class Main {

	public static void main(String[] args) {
		Human human = new Human("Nobuo");
		human.fly();
	}

}
