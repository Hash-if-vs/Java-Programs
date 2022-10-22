package sub_programs;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter A word:");
		String a=scan.nextLine();
		System.out.println("Enter A Char to check:");
		char b=scan.next().charAt(0);
		int n= a.length();
		int i,c=0;
		for(i=0;i<n;i++)
			if(b==a.charAt(i))
				c+=1;
		System.out.println("The char "+b+" is present "+c+" times");
		
			
			
		

	}

}
