package threadTest;

public class Main {

	public static void main(String[] args) {
		MultiThread mt = new MultiThread();
		mt.start();

		for (int i = 0; i < 5; i++) {
			try {
				Long st1 = System.currentTimeMillis();
				Thread.sleep(1000);
				Long st2 = System.currentTimeMillis();
				System.out.println("スレッド1の" + (i + 1) + "度目の処理" + ":" + (st2 - st1) + " [ms]");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
