package problem03;

public class RectTriangle extends Shape {
	private double width;
	private double height;

	public RectTriangle(double width, double height) {
		this.width = width;
		this.height=height;
	}

	@Override
	public double getArea() {
		//System.out.println("");
		double answer=width*height/2;
		
		return answer;
	}

	@Override
	public double getPerimeter() {
		
		return Math.sqrt(Math.pow(width, 2)+ Math.pow(height, 2))+height+width;
	}
}
