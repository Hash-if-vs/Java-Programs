package sub_programs;
	import java.util.Scanner;
	class Area{
		int count=0;
	void AreaCalculate(float r) {
	float area=3.14f*r*r;
	System.out.println("area of circle is: "+area);
	count+=1;
	}
	void AreaCalculate(float base, float height) {
	float area = base*height*0.5f;
	System.out.println("area of triangle is "+area  );
	count+=1;
	}
	void AreaCalculate(int width, int length) {
	int area= width*length;
	System.out.println("area of rectangle is "+area);
	count+=1;
	}
	}

	public class MethodOverloading {
	  public static void main(String[] args) {
	 Area area = new Area();
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter the base of the triangle\n");
	 float baseofTriangle = sc.nextFloat();
	 System.out.println("enter the height of the triangle\n");
	 float heightofTriangle = sc.nextFloat();
	 
	 
	 System.out.println("enter the width of the rectangle\n");
	 int widthOfRectangle = sc.nextInt();
	 System.out.println("enter the height of the rectangle\n");
	 int heightofRectangle = sc.nextInt();
	 
	 
	 System.out.println("enter the radius of the circle");
	 float radiusofCircle = sc.nextFloat();
	 area.AreaCalculate(baseofTriangle,heightofTriangle);
	 area.AreaCalculate(widthOfRectangle,heightofRectangle);
	 area.AreaCalculate(radiusofCircle);


	}
	}
	
