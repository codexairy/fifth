package fifth;
import java.util.*;
public class GregorianCalendar_pra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar calendar = new GregorianCalendar(2021,11,12);
		System.out.println(calendar.get(GregorianCalendar.YEAR) + "年"
				+ calendar.get(GregorianCalendar.MONTH) + "月"
				+ calendar.get(GregorianCalendar.DATE) + "日");
		calendar.setTimeInMillis(1234567898765L);
		System.out.println(calendar.get(GregorianCalendar.YEAR) + "年"
				+ calendar.get(GregorianCalendar.MONTH) + "月"
				+ calendar.get(GregorianCalendar.DATE) + "日");
	}

}
