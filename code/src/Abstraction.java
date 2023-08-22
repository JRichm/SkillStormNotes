
public class Abstraction {

	public static void main(String[] args) {
		Triangle tri = new Triangle();
		Square squ = new Square();
		
		double area = squ.area();
		System.out.println(area);
	}
}


abstract class Shape {
	abstract double area();
}

class Triangle extends Shape {
	double area() {
		return 0;
	}
}

class Square extends Shape {
	double area() {
		return 10;
	}
}