
public class Circle extends Shape {
	private double radius;
	
	public Circle() {
		this.radius=1;
	}
	
	public Circle(double radius) {
		this.radius=radius;
	}
	
	public  double area() {
		return Math.PI*this.radius*this.radius;
		
	}
	
	public  double circumference() {
		return 2*Math.PI*this.radius;
	}
}
