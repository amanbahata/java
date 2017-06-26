/**
* 	Class Box models a cardboard box used for shipment of items
*	@author Aman Bahata
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

	// Constructor used when all dimensions have been specified specified
	public Box(double width, double height, double length){

		// Sizes of the box
		this.width = width;
		this.height = height;
		this.length = length;
	}

	// Constructor used when a cube is defined

	public Box(double length){
		width = length;
		height = length;
		this.length = length;
	}

	// Define accessor methods for the fields

	public double getWidth(){
		return width;
	}
	public double getHeight(){
		return height;
	}
	public double getLength(){
		return length;
	}

	// Define mutator methods for the fields

	public void getWidth(double width){
		this.width = width;
		System.out.println("Box width changed to : " + width);
	}
	public void getHeight(double height){
		this.height = height;
		System.out.println("Box height changed to : " + height);
	}
	public void getLength(double length){
		this.length = length;
		System.out.println("Box length changed to : " + length);
	}

	// Calculate volume of the box

	public double volume(){
		return width * height * length;
	}

}