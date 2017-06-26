/**
*	@author Aman Bahata
*/

public class DemoShipment{

	public static void main(String[] args) {
		
		// Rectangular box
		Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
		Shipment shipment2 = new Shipment(2, 3, 4, 0.75, 1.28);

		// Cube shaped box
		Shipment shipment3 = new Shipment(10, 10, 2.50);


		System.out.println("The volume of shipment 1 is : " + shipment1.volume() + " cm3.");
		System.out.println("Shipment 1 weighs : " + shipment1.getWeight() + " kg.");
		System.out.println("Shipment 1 costs : £ " + shipment1.getCost());

		System.out.println("*************************************************");
		System.out.println();

		System.out.println("The volume of shipment 2 is : " + shipment2.volume() + " cm3.");
		System.out.println("Shipment 2 weighs : " + shipment2.getWeight() + " kg.");
		System.out.println("Shipment 2 costs : £ " + shipment2.getCost());	

		System.out.println("*************************************************");
		System.out.println();
		
		System.out.println("The volume of shipment 3 is : " + shipment3.volume() + " cm3.");
		System.out.println("Shipment 3 weighs : " + shipment3.getWeight() + " kg.");
		System.out.println("Shipment 3 costs : £ " + shipment3.getCost());	
	}
}