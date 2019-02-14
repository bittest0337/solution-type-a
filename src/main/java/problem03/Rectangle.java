package problem03;

public class Rectangle extends Shape implements Resizable {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void resize(double rate) {
		this.width*=rate;
		this.height*=rate;
	}

	@Override
	public double getArea() {
		
		return width*height;
	}

	@Override
	public double getPerimeter() {
		return width*2 + height*2;
	}
}