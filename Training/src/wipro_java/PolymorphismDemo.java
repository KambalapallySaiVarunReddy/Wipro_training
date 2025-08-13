package wipro_java;
class Shape{
	void draw() {
		System.out.println("Drawimg a shape");
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("Drawing a circle");
	}
}
class Rectangle extends Shape{
	void draw() {
		System.out.println("Drawing a rectangle");
	}
}
public class PolymorphismDemo {
	public static void main(String[]args) {
		Shape s1 = new Circle();
		Shape s2 = new Rectangle();
		s1.draw();
		s2.draw();
			
	}
}
