
public class CookieData {
	public static String get() {
		String cookieData=


				"_ht=person1; EMAP_LANG=zh; _WEU=7hBLL3qWH6iM5OB5GvysR8B8LvA13ovmarcIMiAZ9qKEwk*3o59dpj5afZVH4PxXgKDkmBbqI1PAym2DmoGuFenv0TeX56FW5k27GJYA3GRS9w_k0ZmG9PM0u6Pq7WU5DtDS4BXc5BRwoK6nMtjBl58Ou3KjTJ_lznsQURKi3PNS637jcvBJjI*aJ0Zx7msVVf174ToFpJjVRyGwBhYQ6kw7gXDIavQcnrenvdTSBGNBr1EfH8f4oIRJbR*fL7NL; Hm_lvt_c261c1043dc7de23df8add1cc5c9852f=1636766138; _ga=GA1.3.1444674381.1636766138; route=c83e11eebb8da619ef6a94bc26688b29; JSESSIONID=N3hnhWfLLdGfX9cL4pZ6hvVNvJqk1NpyrBtdkGjXmT7RHCyJx52y!1530936782; MOD_AUTH_CAS=MOD_AUTH_ST-278227-co2Fr397kdjf1SksvsLeRbEX0C8localhost";
				cookieData=cookieData.substring(cookieData.indexOf("_ht"),cookieData.length());
		return cookieData;
	}
}
