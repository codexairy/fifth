package fifth;
import java.util.Scanner;
public class LinearEquation_pra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("输入a、b、c、d、e和f的值：");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		LinearEquation s = new LinearEquation(a,b,c,d,e,f);
		System.out.println("a的值：" + s.getA());
		System.out.println("b的值：" + s.getB());
		System.out.println("c的值：" + s.getC());
		System.out.println("d的值：" + s.getD());
		System.out.println("e的值：" + s.getE());
		System.out.println("f的值：" + s.getF());
		
		if(s.isSolvable()==false)
			System.out.print("The equation has no solution");
		else {
			System.out.println("x的值：" + s.getX());
			System.out.println("y的值：" + s.getY());
		}
	}

}
