package pkgShape;

public class Rectangle extends Shape{
	private int length;
	private int width;
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rectangle(int length, int width) { 
		super();
		this.length = length;
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public double area() {
		return this.length * this.width;
	}
	public double perimeter() {
		return (this.length *2) + (this.width *2);
	}
		
		

}
