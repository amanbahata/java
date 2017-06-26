/**
*	
*
*/

public class Box{

	private double width;
	private double height;
	private double length;

	// Define constructors

	public Box(Box box){
		width = box.getWidth();
		height = box.getHeight();
		length = box.getLength();
	}

	// Define accessor and mutators

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