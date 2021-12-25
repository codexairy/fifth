package fifth;
import java.util.*;
public class Random_pra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random a = new Random(1000);
		for(int i = 0;i < 50;i++) {
			System.out.print(a.nextInt(100) + " ");
		}
	}

}
