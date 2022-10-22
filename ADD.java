package sub_programs;
import java.util.Scanner;

public class ADD {

	public static void main(String[] args) {
		int a,b,s;
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter A:");
		a=scan.nextInt();
		System.out.println("Enter B:");
		b=scan.nextInt();
		s=a+b;
		System.out.println("Sum="+s);
		

	}

}
