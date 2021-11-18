import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
// Post的请求使用okhttp后，能明显的感觉到无论是在性能上还是稳定性上都有了一个巨大的飞升，我真的是越来越喜欢这些组件了
public class post {
	public static String sendPost(String url, String param) throws Exception {
		OkHttpClient client = new OkHttpClient().newBuilder()
				  .build();
				MediaType mediaType = MediaType.parse(" application/x-www-form-urlencoded; charset=UTF-8");
				RequestBody body = RequestBody.create(mediaType, param);
				Request request = new Request.Builder()
				  .url("http://jwxt.bistu.edu.cn/jwapp/sys/kxjas/modules/kxjscx/cxkxjs.do")
				  .post(body)
				  .addHeader("Host", " jwxt.bistu.edu.cn")
				  .addHeader("Accept", " */*")
				  .addHeader("X-Requested-With", " XMLHttpRequest")
				  .addHeader("User-Agent", " Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/95.0.4638.69 Safari/537.36")
				  .addHeader("Content-Type", " application/x-www-form-urlencoded; charset=UTF-8")
				  .addHeader("Origin", " http://jwxt.bistu.edu.cn")
				  .addHeader("Referer", " http://jwxt.bistu.edu.cn/jwapp/sys/kxjas/*default/index.do?EMAP_LANG=zh")
				  .addHeader("Accept-Language", " zh-CN,zh;q=0.9")
				  .addHeader("Cookie",CookieData.get())
				  .addHeader("Connection", " keep-alive")
				  .build();
				Response response = client.newCall(request).execute();
				String sss=response.body().string();
				return sss;
	}
}
