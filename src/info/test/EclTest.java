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
		
		System.out.println("");
		
		// オブジェクト、コンストラクタ
		Human human = new Human("太郎", 19800101);
		
		System.out.println("名前：" + human.name);
		System.out.println("生年月日：" + human.birthday);
		System.out.println("満腹度：" + human.manpukudo);
		
		System.out.println("");
		
//		human.name = "太郎";
//		human.birthday = 19800101;
		
		Human human2 = new Human("美香", 20111231);
//		human2.name = "美香";
//		human2.birthday = 20111231;
		
		Human human3 = new Human("ジョン", 19630721);
		
		System.out.println("1人目");
		System.out.println("名前：" + human.name);
		System.out.println("生年月日：" + human.birthday);
		
		System.out.println("");
		
		System.out.println("2人目");
		System.out.println("名前：" + human2.name);
		System.out.println("生年月日：" + human2.birthday);
		
		human.eat();
		human.eat();
		
		human2.eat();
		
		System.out.print(human.name + "の満腹度：");
		System.out.println(human.manpukudo);
		System.out.print(human2.name + "の満腹度：");
		System.out.println(human2.manpukudo);
		
		System.out.println("");
		
		System.out.println("3人目");
		System.out.println("名前：" + human3.name);
		System.out.println("生年月日：" + human3.birthday);
		System.out.println("満腹度：" + human3.manpukudo);
		
		System.out.println("");
		
		// コンストラクタ
		status  hero = new status();
		status warrior = new status("ノックス",80,10,30);
		status wizard = new status("マージ",10,60);
		status fighter = new status("ケン","武闘家");
		status thief = new status("ルビー");
		
		System.out.println("名前　" + hero.Name);
		System.out.println("職業　" + hero.Job);
		System.out.println("ちから　" + hero.STR);
		System.out.println("まもり　" + hero.DEF);
		System.out.println("まほう　" + hero.MAG);
		System.out.println("すばやさ　" + hero.SPD);
		
		System.out.println("");
		
		System.out.println("名前　" + warrior.Name);
		System.out.println("職業　" + warrior.Job);
		System.out.println("ちから　" + warrior.STR);
		System.out.println("まもり　" + warrior.DEF);
		System.out.println("まほう　" + warrior.MAG);
		System.out.println("すばやさ　" + warrior.SPD);
		
		System.out.println("");
		
		System.out.println("名前　" + wizard.Name);
		System.out.println("職業　" + wizard.Job);
		System.out.println("ちから　" + wizard.STR);
		System.out.println("まもり　" + wizard.DEF);
		System.out.println("まほう　" + wizard.MAG);
		System.out.println("すばやさ　" + wizard.SPD);
		
		System.out.println("");
		
		System.out.println("名前　" + fighter.Name);
		System.out.println("職業　" + fighter.Job);
		System.out.println("ちから　" + fighter.STR);
		System.out.println("まもり　" + fighter.DEF);
		System.out.println("まほう　" + fighter.MAG);
		System.out.println("すばやさ　" + fighter.SPD);
		
		System.out.println("");
		
		System.out.println("名前　" + thief.Name);
		System.out.println("職業　" + thief.Job);
		System.out.println("ちから　" + thief.STR);
		System.out.println("まもり　" + thief.DEF);
		System.out.println("まほう　" + thief.MAG);
		System.out.println("すばやさ　" + thief.SPD);
		
		System.out.println("");
		
		hero.STRUP();
		hero.MAGUP();
		hero.SPDUP();
		
		warrior.STRUP();
		warrior.STRUP();
		
		wizard.MAGUP();
		wizard.MAGUP();
		
		fighter.SPDUP();
		thief.SPDUP();
		
		System.out.println("能力上昇後のステータス");
		
		System.out.println("名前　" + hero.Name);
		System.out.println("職業　" + hero.Job);
		System.out.println("ちから　" + hero.STR);
		System.out.println("まもり　" + hero.DEF);
		System.out.println("まほう　" + hero.MAG);
		System.out.println("すばやさ　" + hero.SPD);
		
		System.out.println("");
		
		System.out.println("名前　" + warrior.Name);
		System.out.println("職業　" + warrior.Job);
		System.out.println("ちから　" + warrior.STR);
		System.out.println("まもり　" + warrior.DEF);
		System.out.println("まほう　" + warrior.MAG);
		System.out.println("すばやさ　" + warrior.SPD);
		
		System.out.println("");
		
		System.out.println("名前　" + wizard.Name);
		System.out.println("職業　" + wizard.Job);
		System.out.println("ちから　" + wizard.STR);
		System.out.println("まもり　" + wizard.DEF);
		System.out.println("まほう　" + wizard.MAG);
		System.out.println("すばやさ　" + wizard.SPD);
		
		System.out.println("");
		
		System.out.println("名前　" + fighter.Name);
		System.out.println("職業　" + fighter.Job);
		System.out.println("ちから　" + fighter.STR);
		System.out.println("まもり　" + fighter.DEF);
		System.out.println("まほう　" + fighter.MAG);
		System.out.println("すばやさ　" + fighter.SPD);
		
		System.out.println("");
		
		System.out.println("名前　" + thief.Name);
		System.out.println("職業　" + thief.Job);
		System.out.println("ちから　" + thief.STR);
		System.out.println("まもり　" + thief.DEF);
		System.out.println("まほう　" + thief.MAG);
		System.out.println("すばやさ　" + thief.SPD);
		
		System.out.println("");
	}

}
