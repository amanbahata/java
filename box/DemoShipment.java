/**
*	@author Aman Bahata
*/

public class DemoShipment{

	public static void main(String[] args) {
		
		Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);

		Shipment shipment2 = new Shipment(10, 10, 2.50);


		System.out.println("The volume of shipment 1 is : " + shipment1.volume() + " cm3.");
		System.out.println("Shipment 1 weighs : " + shipment1.getWeight() + " kg.");
		System.out.println("Shipment 1 costs : £ " + shipment1.getCost());



		System.out.println("The volume of shipment 2 is : " + shipment2.volume() + " cm3.");
		System.out.println("Shipment 2 weighs : " + shipment2.getWeight() + " kg.");
		System.out.println("Shipment 2 costs : £ " + shipment2.getCost());	
	}
}