

public class Shipment extends BoxWeight{

	private cost;

	public Shipment(Shipment box){
		super(box);
		cost = box.getCost();
	}

	public Shipment(double width, double height, double length, double weigth, double cost){
		super(width, height, length, weigth);
		this.cost = cost;
	}

	public Shipment (double length, double weight, double cost){
		super(length, weigth);
		this.cost = cost;
	}

	public double getCost(){
		return cost;
	}
}