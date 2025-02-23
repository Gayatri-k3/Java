//Write a Java program to calculate the area and perimeter of a rectangle given its length and width as input
public class AP{
	public static void main(String args[]){
	int length = 19;
	int width = 89;
	int area = length*width;
	int perimeter = 2*(length+width);
	System.out.println("Area of rectangle is :"+ area + "\nPerimeter of Rectangle is :"+perimeter);
	}
}