package sub_programs;
import java.util.LinkedList;
import java.util.List;

public class linkedList {

	public static void main(String[] args) {
		List<Integer> numbers=new LinkedList<>();
		numbers.add(2);
		numbers.add(4);
		numbers.add(10);
		numbers.add(12);
		numbers.add(14);
	    System.out.println("List : " + numbers);
		int number =numbers.get(3);
		System.out.println("Element to be removed : " + number);
		int index = numbers.indexOf(12);
		System.out.println("Position of  is " + index);
		int removedNumber = numbers.remove(3);
		System.out.println("Removed Element: " + removedNumber);
		System.out.println("List : " + numbers);
	

	}

}
