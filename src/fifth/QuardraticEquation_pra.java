package fifth;

import java.util.Scanner;

public class QuardraticEquation_pra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("����a��b��c��ֵ��");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		QuardraticEquation s = new QuardraticEquation(a,b,c);
		
		System.out.println("a��ֵ��" + s.getA());
		System.out.println("b��ֵ��" + s.getB());
		System.out.println("c��ֵ��" + s.getC());
		
		if(s.getDiscriminant() > 0)
			System.out.println("�б�ʽ>0,���������������ֱ�Ϊ r1:"+s.getRoot1()+" r2:"+s.getRoot2());
		else if(s.getDiscriminant() == 0)
			System.out.println("�б�ʽ=0������ֻ��һ���� r:"+ s.getRoot1());
		else
			System.out.println("The equation has no roots");
	}

}
