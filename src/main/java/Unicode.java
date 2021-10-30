
import java.io.FileNotFoundException;

import javax.naming.ldap.StartTlsRequest;

public class Unicode {
	public static void main(String[] args) throws Exception {
		int month=11;
		int day = 1;
		int terminalDay = 5;
		// 开始执行采集操作
		startThread(month,day, terminalDay);
	}

	// 开启三个线程
	private static void startThread(int month,int day, int terminalDay) {
		long startTime = System.currentTimeMillis();
		new Thread(() -> {
			try {
				XY xy = new XY(month,day, terminalDay);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			System.out.print("Time： " + (System.currentTimeMillis() - startTime) + " ms    ");
		}).start();
		new Thread(() -> {
			try {
				JXQ jxq = new JXQ(month,day, terminalDay);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}).start();
		new Thread(() -> {
			try {
				QH qh =new QH(month,day, terminalDay);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}).start();
	}
}
