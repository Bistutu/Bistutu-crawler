
import java.io.FileNotFoundException;

import javax.naming.ldap.StartTlsRequest;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Unicode {
	public static void main(String[] args) throws Exception {
		int month = 11;
		int day = 18;
		int terminalDay = day+3;

		// 以下操作为用Command Line创建目录，虽然我知道其他方法也是可以的，但是现在，我喜欢这种方法。
		String cmd = "mkdir " + Path.getPath();
		for (int i = 0; i < 3; i++) {
			Runtime.getRuntime().exec(cmd + (i + 1));
		}
		// Command Line结束
		startThread(month, day, terminalDay);
	}

	private static void startThread(int month, int day, int terminalDay) throws Exception {
		long startTime = System.currentTimeMillis();
		try {

			new Thread(()->{
				try {
					XY xy = new XY(month, day, terminalDay);
					System.out.print("Time：" + (System.currentTimeMillis() - startTime) + " ms    ");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}).start();

			new Thread(()->{
				try {
					JXQ jxq = new JXQ(month, day, terminalDay);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}).start();

			new Thread(()->{
				try {
					QH qh = new QH(month, day, terminalDay);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}).start();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
