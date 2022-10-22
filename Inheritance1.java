package sub_programs;
import java.util.Scanner;
	class Employee{
		static Scanner sc = new Scanner(System.in);
		static int BaseSal;
		static int TA;
		static int DA;
		static int GrossSal;
		static void EmployeeData(){
			System.out.println("Enter Employee details\n Base salary:");
			BaseSal=sc.nextInt();
			System.out.println("Travel allowance:");
			TA=sc.nextInt();
			System.out.println("Domestic allowance:");
			DA=sc.nextInt();
			GrossSal=BaseSal+TA+DA;
			System.out.println("Gross Salary of employee:"+GrossSal);
		}
		}
	class Engineer extends Employee{
		static int EngSal=GrossSal*2;
		static void EngData() {
			System.out.println("Gross Salary of engineer:"+EngSal);
		}
	}
public class Inheritance1{
	public static void main(String[] args) {
	Employee.EmployeeData();
	Engineer.EngData();
	
	}	
}
