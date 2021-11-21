
public class CookieData {
	public static String get() {
		String cookieData=

				"Cookie: _ht=person1; EMAP_LANG=zh; _WEU=9AlFLa1wabtwZe1euNSuesFNqiAx2i9ge32F0HaJPm*9US1R0RGa6U51AA0dPZD78Q*brRUMqT2PUKOL6fRftVfrtYi42gffJ99nGqJq78LxHKMhYww2UWPbooMyvUdoAj7jUMbICec*BV4yKA7ZVtZakD3XTrfOQJZf3mMbvzJD6CSDmkVmODl9ozPXIFNQLc9Z*BADKL2u*CjqR9EDqjpbUZocsiu_WpbtPV1os2NflMByVaS1CS..; Hm_lvt_c261c1043dc7de23df8add1cc5c9852f=1636766138; _ga=GA1.3.1444674381.1636766138; route=c83e11eebb8da619ef6a94bc26688b29; MOD_AUTH_CAS=MOD_AUTH_ST-281326-2teFuygSmCxEqxq3YM4YJAldUGklocalhost; JSESSIONID=QJvchh5BTp0JcvJ3GmlkGmvGVQXN20YXhp7LVhhgFMgmv12f79X2!858574852";

				cookieData=cookieData.substring(cookieData.indexOf("_ht"),cookieData.length());
		return cookieData;
	}
}
