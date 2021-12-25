package fifth;
import java.util.*;
public class Date_pra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		for(int i=10000;i<=10000000;i*=10) {
			date.setTime(i);
			System.out.println(date.toString());
		}
		
		date.setTime(10000000000L);
		System.out.println(date.toString());
		
		date.setTime(100000000000L);
		System.out.println(date.toString());
	}

}
