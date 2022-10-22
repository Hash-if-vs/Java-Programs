package sub_programs;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		int a,b,c;
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter A:");
		a=scan.nextInt();
		System.out.println("Enter B:");
		b=scan.nextInt();
		System.out.println("Before swapping\nA="+a);
		System.out.println("B="+b);
		c=a;
		a=b;
		b=c;
		System.out.println("After swapping\nA="+a);
		System.out.println("B="+b);
		
				

	}

}
