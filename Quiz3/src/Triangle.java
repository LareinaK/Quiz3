
public class Triangle {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	public Triangle() {
	}

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getside1() {
		return side1;
	}

	public double getside2() {
		return side2;
	}

	public double getside3() {
		return side3;
	}

	public void setside1(double side1) {
		this.side1 = side1;
	}

	public void setside2(double side2) {
		this.side2 = side2;
	}

	public void setside3(double side3) {
		this.side3 = side3;
	}

	public double getArea() {
		double p = (side1 + side2 + side3) / 2;
		return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
	}

	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	public String toString() {
		return "Side 1 = " + side1 + " Side 2 = " + side2 + " Side 3 = " + side3;
	}

}
