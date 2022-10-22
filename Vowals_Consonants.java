package sub_programs;

import java.util.Scanner;

public class Vowals_Consonants {

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter A char:");
		char a=scan.next().charAt(0);
		if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u' || a=='A' || a=='E' || a=='I' || a=='O' || a=='U')
			System.out.println("Character is a vowel");
		else
			System.out.println("Character is not a vowel");

	}

}
