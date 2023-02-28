package regularTest;

public class Regular {

	public static void main(String[] args) {
		String a = "僕はJavaが大好きだ";
		System.out.println(a);
		
		if(a.matches(".*Java.*")) {  // 引数に正規表現を渡す
			System.out.println("この文字列には「Java」が含まれています");
		}else {
			System.out.println("この文字列には「java」が含まれていません");
		}
		
		if(a.matches("Java.*")){
		    System.out.println("この文字列には「Java」が含まれています");
		}else{
		    System.out.println("この文字列には「Java」が含まれていません");
		}
		
		if(a.matches("僕は....が大好きだ")){
		    System.out.println("この文字列には「Java」が含まれています");
		}else{
		    System.out.println("この文字列には「Java」が含まれていません");
		}
		
		String b = "おーい";
		System.out.println(b);
		
		if(b.matches("おー*い")){
		    System.out.println("一致");
		}else{
		    System.out.println("不一致");
		}
		
		String c = "暑い";
		System.out.println(c);
		
		if(c.matches("暑い|寒い")){
		    System.out.println("一致");
		}else{
		    System.out.println("不一致");
		}
		
		c = "今日は寒いです";
		System.out.println(c);
		
		if(c.matches("今日は(暑い|寒い|涼しい)です")){
		    System.out.println("一致");
		}else{
		    System.out.println("不一致");
		}
		
		String d = "abcd";
		System.out.println(d);
		
		if(d.matches("abc[a-zA-Z0-9]")){
		    System.out.println("一致");
		}else{
		    System.out.println("不一致");
		}
		
	}

}
