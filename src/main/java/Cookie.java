
public class Cookie {
	public static String get() {
		String cookieData=
"Cookie: _ht=person1; EMAP_LANG=zh; _WEU=h0_*SM1gdXp_Lc_Yicxi7wpipQ6IvUhmJ7Dh*LNgcfh7S8HJk2eumlNwLCu5p7Ur3O7Yfjhm2JzLA_5lnFfAitsBhKukfNJgsxWoo42*g7Faw38m770yQJlxNFnQoeHggf6foCHMHoQQfbvErhUZbagvE_IO8_Ub0X0BaWWIA04gosWgdLSsXfXYJ8drrhqmG5UCjeZ74Jo.; route=c83e11eebb8da619ef6a94bc26688b29; MOD_AUTH_CAS=MOD_AUTH_ST-246579-NZSXKkE-kefZT2YxemqmQvXUxC0localhost; JSESSIONID=y1Nfh8Lb0lyC8dvGr5ym56sNxLT1v5j10pnd8ZXGLVLFbgnk2GLW!-1241296154"				;
		cookieData=cookieData.substring(cookieData.indexOf("_ht"),cookieData.length());
		return cookieData;
	}
}
