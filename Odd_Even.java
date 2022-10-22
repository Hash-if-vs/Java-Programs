package sub_programs;

import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
		int a;
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter A:");
		a=scan.nextInt();
		if(a%2==0)
			System.out.println("A is even");
		else
			System.out.println("A is odd");

	}

}
