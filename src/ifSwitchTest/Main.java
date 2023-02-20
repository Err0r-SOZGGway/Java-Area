package ifSwitchTest;

public class Main {

	public static void main(String[] args) {
		int num = 2;
		
		// if文
		if(num == 2) {
			System.out.println("numは2です");
		}else if(num <= 1) {
			System.out.println("numは1以下です");
		}else {
			System.out.println("numは3以上です");
		}
		
		// switch文
		switch (num) {
		case 1: 
			System.out.println("numは1です");
			break;
		case 2:
			System.out.println("numは2です");
			break;
		case 3:
		case 4:
			System.out.println("numは3か4です");
			break;
		default:
			System.out.println("numは1,2,3,4以外です");
		    break;
		}

	}

}
