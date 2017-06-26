

public class Shipment extends BoxWeight{

	private double cost;

	public Shipment(Shipment box){
		super(box);
		cost = box.getCost();
	}

	public Shipment(double width, double height, double length, double weight, double cost){
		super(width, height, length, weight);
		this.cost = cost;
	}

	public Shipment (double length, double weight, double cost){
		super(length, weight);
		this.cost = cost;
	}

	public double getCost(){
		return cost;
	}
}