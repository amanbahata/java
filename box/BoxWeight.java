/**
*	Class BoxWeight adds weight to the box
*	@author Aman Bahata
*/

public class BoxWeight extends Box{

	private double weight;

	public BoxWeight(BoxWeight box){
		super(box);
		weight = box.getWeight();
	}

	public BoxWeight(double width, double height, double length, double weight){
		super(width, height, length);
		this.weight = weight;
	}

	public BoxWeight(double length, double weight){
		super(length);
		this.weight = weight;
	}

	public double getWeight(){
		return weight;
	}

}