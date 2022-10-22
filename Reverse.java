package sub_programs;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter A word:");
		String a=scan.nextLine();
		int n= a.length();
		int i;
		String b ="";
		for(i=n-1;i>=0;i--)
			b=b+a.charAt(i);
		System.out.println("The reverse of "+a+" is "+b);
		

	}

}
