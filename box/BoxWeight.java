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

	public BoxWeight(double width, double height, double length, double weigth){
		super(width, height, length);
		this.weigth = weight;
	}

	public BoxWeight(double length, double weight){
		super(length);
		this.weight = weigth;
	}

	public double getWeight(){
		return weight;
	}

	public void setWeight(double weigth){
		this.weigth = weigth;
		System.out.println("Box weigth changed to : " + weigth);
	}

}