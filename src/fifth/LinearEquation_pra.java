package fifth;
import java.util.Scanner;
public class LinearEquation_pra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("����a��b��c��d��e��f��ֵ��");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		LinearEquation s = new LinearEquation(a,b,c,d,e,f);
		System.out.println("a��ֵ��" + s.getA());
		System.out.println("b��ֵ��" + s.getB());
		System.out.println("c��ֵ��" + s.getC());
		System.out.println("d��ֵ��" + s.getD());
		System.out.println("e��ֵ��" + s.getE());
		System.out.println("f��ֵ��" + s.getF());
		
		if(s.isSolvable()==false)
			System.out.print("The equation has no solution");
		else {
			System.out.println("x��ֵ��" + s.getX());
			System.out.println("y��ֵ��" + s.getY());
		}
	}

}
