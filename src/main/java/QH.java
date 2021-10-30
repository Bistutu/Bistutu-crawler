
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;

public class QH {

	public QH(int month,int day,int teiminalDay) throws FileNotFoundException {
		int KSJC=0,JSJC=0;
		String date,data;
		PrintWriter printWriter = null;
		int paraTransfer = 0, time = 0; // time是时段
		Character para = 'a'; // para是参数
		// 外层最大的循环
		while (day <= teiminalDay) {
			date = "2021-"+month+"-" + day;
			time = 0;
			int colorNumber=0;
			printWriter = new PrintWriter(new File("C:\\Users\\1\\Desktop\\空教室数据/3/3"+month + day + ".json"));
			printWriter.print("[");
			
			while (time < 1000) {
				if (time == 0 || time == 1 || time == 2 || time == 3)
					printWriter.print("{\"a\":\"\",\"b\":\"\",\"c\":\"\",\"d\":\"" + time + "\"},");
				// 发送post请求
				if (time == 0) {
					KSJC = 1;
					JSJC = 12;
					colorNumber=0;
				}
				if (time == 1) {
					KSJC = 1;
					JSJC = 5;
					colorNumber=0;
				}
				if (time == 2) {
					KSJC = 6;
					JSJC = 9;
					colorNumber=0;
				}
				if (time == 3) {
					KSJC = 10;
					JSJC = 12;
					colorNumber=0;
				}
				if (time == 112) {
					KSJC = 1;
					JSJC = 2;
					colorNumber=1;
				}
				if (time == 135) {
					KSJC = 3;
					JSJC = 5;
					colorNumber=2;
				}
				if (time == 267) {
					KSJC = 6;
					JSJC = 7;
					colorNumber=1;
				}
				if (time == 289) {
					KSJC = 8;
					JSJC = 9;
					colorNumber=2;
				}

				String postBody = "XXXQDM=3&JASLXDM=02&KXRQ=" + date + "&KSJC=" + KSJC + "&JSJC=" + JSJC;
				data = post.sendPost("http://jwxt.bistu.edu.cn/jwapp/sys/kxjas/modules/kxjscx/cxkxjs.do",
						postBody);
				int begin = data.indexOf("rows") + 6;
				int end = data.lastIndexOf("]");
				data = data.substring(begin, end + 1); // data是初始的的JSON数组
				//
				List<assistClass> userList = JSON.parseArray(data, assistClass.class); // userList是原始JSON的对象数组
				String emptyClass;

				// emptyClassArray是为了排除干扰和排序
				ArrayList<String> emptyClassArray = new ArrayList<String>();
				
				for (assistClass assist : userList) { // assist是原始JSON的对象
						emptyClassArray.add(assist.JASMC.substring(2, assist.JASMC.length()));
				}
				// 排序
				java.util.Collections.sort(emptyClassArray);
				/* 至此，emptyClassArray里面均为阶梯教室或者二教教室 */

				int inline = 0;
				
				// time的跳转关系
				switch (time) {
				case 0:
					time = 1;
					break;
				case 1:
					time = 112;
					break;
				case 112:
					time = 135;
					break;
				case 135:
					time = 2;
					break;
				case 2:
					time = 267;
					break;
				case 267:
					time = 289;
					break;
				case 289:
					time = 3;
					break;
				case 3:
					time = 1000;
					break;
				}
			}

			printWriter.print("]");
			printWriter.close();
			System.out.print(day + "号 ");
			day++;
		}
	}
	}
	


