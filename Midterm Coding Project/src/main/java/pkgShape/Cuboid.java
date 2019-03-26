package pkgShape;

public class Cuboid extends Rectangle{
	private int depth;
	public Cuboid() {
	super.getLength();
	super.getWidth();
	this.depth = depth;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public double volume() {
		return super.getLength() * super.getWidth() * this.depth;
	}
	public double area() { 
		return (super.getLength() * super.getWidth()) * 6;
	}
	public double perimeter() {
		throw new UnsupportedOperationException("Invalid operation for Cuboid.");
	}
	public int compareTo(Rectangle b) {
		if(this.area() > b.area()) return 1;
		if(this.area() < b.area()) return -1;
		else
			return 0;
	}
}
