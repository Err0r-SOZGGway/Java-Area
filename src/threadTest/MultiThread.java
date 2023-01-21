package threadTest;

public class MultiThread extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Long st1 = System.currentTimeMillis();
				Thread.sleep(1300);
				Long st2 = System.currentTimeMillis();
				System.out.println("スレッド2の" + (i + 1) + "度目の処理" + ":" + (st2 - st1) + " [ms]");
			} catch (InterruptedException e) {
				System.out.println("割り込まれました");
			}
		}
	}
}
