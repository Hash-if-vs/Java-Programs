package sub_programs;

import java.util.Scanner;

public class Largest_of_2 {

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		int a,b,c,l;
		System.out.println("enter the first num:");
		a=scan.nextInt();
		System.out.println("enter the 2nd num:");
		b=scan.nextInt();
		System.out.println("enter the 3rd num:");
		c=scan.nextInt();
		if(a>b && a>c)
			l=a;
		else if(b>a && b>c)
			l=b;
		else
			l=c;
		System.out.println("The largest of the 3 is "+l);

	

}
}
