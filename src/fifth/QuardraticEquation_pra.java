package fifth;

import java.util.Scanner;

public class QuardraticEquation_pra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("输入a、b和c的值：");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		QuardraticEquation s = new QuardraticEquation(a,b,c);
		
		System.out.println("a的值：" + s.getA());
		System.out.println("b的值：" + s.getB());
		System.out.println("c的值：" + s.getC());
		
		if(s.getDiscriminant() > 0)
			System.out.println("判别式>0,方程有两个根，分别为 r1:"+s.getRoot1()+" r2:"+s.getRoot2());
		else if(s.getDiscriminant() == 0)
			System.out.println("判别式=0，方程只有一个根 r:"+ s.getRoot1());
		else
			System.out.println("The equation has no roots");
	}

}
