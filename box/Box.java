/**
*	
*
*/

public class Box{

	private double width;
	private double height;
	private double length;

	
	// Construct a clone of a box object
	public Box(Box box){
		width = box.getWidth();
		height = box.getHeight();
		length = box.getLength();
	}

	// Constructor used when all dimensions specified
	public Box(double width, double height, double length){
		this.width = width;
		this.height = height;
		this.length = length;
	}

	// Constructor used when a cube is defined

	public Box(double length){
		width = length;
		height = length;
		length = length;
	}

	// Define accessor and mutator methods for the fields

	public double getWidth(){
		return width;
	}
	public double getHeight(){
		return height;
	}
	public double getLength(){
		return length;
	}
}