import java.util.Calendar;
import java.util.GregorianCalendar;

public class tetst {
    public static void main(String[] args) {
        GregorianCalendar gregorianCalendar=new GregorianCalendar();
        int today=gregorianCalendar.get(Calendar.DAY_OF_MONTH);
        int currentMonth=gregorianCalendar.get(Calendar.MONTH)+1;
        System.out.println(currentMonth);
    }
}
