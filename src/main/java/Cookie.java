
public class Cookie {
	public static String get() {
		String cookieData="Cookie: _ht=person1; EMAP_LANG=zh; _WEU=mYiXT3j6GJYk5kc68Kz9Ng**L2effn5LJJhJy*yPjCXbtdxdBGdZdxBlgmLphOf6_8Pb7ecwdw081Wv*4TVys4C*Xfc*N*H_5S*IcSkfQxk5zxXGFRzyKADEobVysnE7_MFGBZY27O88gJhCRZE2bOog0qMMXINHLcJ1Hi1991Y7v0N7UM4bw*HRp3Mb6v63bDN5ycPYBSnaFm8RANIKHwb3UINp689u; route=c83e11eebb8da619ef6a94bc26688b29; MOD_AUTH_CAS=MOD_AUTH_ST-254522-yf0X16NbZkeOiI-Ux5zwKw1jukYlocalhost; JSESSIONID=cl3DhCnff9kQ219vv5d2YTJYGlH3nydYyx11T2ynwskHDs0wMngB!-515234789";
				
		cookieData=cookieData.substring(cookieData.indexOf("_ht"),cookieData.length());
		return cookieData;
	}
}
