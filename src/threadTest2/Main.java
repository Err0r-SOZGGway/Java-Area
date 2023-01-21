package threadTest2;

public class Main {

	public static void main(String[] args) {
		MultiThread mt = new MultiThread();
		Thread thread = new Thread(mt);
		thread.start();
		
		for(int i=0;i<5;i++) {
			try {
				long st1 = System.currentTimeMillis();
				Thread.sleep(1000);
				long st2 = System.currentTimeMillis();
				System.out.println("スレッド1の"+(i+1)+"度目の処理"+":"+(st2-st1)+" [ms]");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
