package sub_programs;
abstract class Shape{
	 abstract void NumberOfSides();
}
class Rectangle extends Shape{
	void NumberOfSides() {
	System.out.println("Rectangle has 4 sides");
	}
	
}
class Triangle extends Shape{
	void NumberOfSides() {
		System.out.println("Triangle has 3 sides");
		}
	
}
class Hexagon extends Shape{
	void NumberOfSides() {
		System.out.println("Hexagon  has 6 sides");
		}
	
}

public class Abstract {

	public static void main(String[] args) {
		Rectangle re= new Rectangle();
		Triangle tr=new Triangle();
		Hexagon he=new Hexagon();
		re.NumberOfSides();
		tr.NumberOfSides();
		he.NumberOfSides();
		
	}

}
