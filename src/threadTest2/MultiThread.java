package threadTest2;

public class MultiThread implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				long st1 = System.currentTimeMillis();
				Thread.sleep(1500);
				long st2 = System.currentTimeMillis();
				System.out.println("スレッド2の" + (i + 1) + "度目の処理" + ":" + (st2 - st1) + " [ms]");
			} catch (InterruptedException e) {
				System.out.println("割り込まれました");
			}
		}
	}
}
