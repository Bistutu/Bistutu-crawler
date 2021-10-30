
public class Cookie {
	public static String get() {
		String cookieData="Cookie: _ht=person1; EMAP_LANG=zh; _WEU=bbiOHjFlYBLMo6LmRmuAANJHQ*c5aM1h4ALOoGpVHGdPLBs_wJm4h0kGNggqJMaCBNQeKup3o2C6oa4vqqXkC9P1x*JtDA2BCy8BoSbrDEvkbPH9N3FAeLN2wdTpHq9y0hcTgcneF4ppwiaqAumrsi94euAhs82p5WWDAvti4yErysqyQ1IFk9_3TNUqyzMQY5bu3HxYivKkg7B5HDhtdHo5HFFA0hff; route=c83e11eebb8da619ef6a94bc26688b29; JSESSIONID=RbzTh8GVK8KL1DTMlbCHQ5hyjvbPbnfhGrGSdnnqWzLchLvZhCGg!1961833876; MOD_AUTH_CAS=MOD_AUTH_ST-246821-uw13CxOK2oEJiX7R1-TPp7uGSZslocalhost";
				cookieData=cookieData.substring(cookieData.indexOf("_ht"),cookieData.length());
		return cookieData;
	}
}
