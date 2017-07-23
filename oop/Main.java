public class Main{
	public static void main(String[] args) {


		Car ford = new Car("Ford", 5, 300);

		System.out.println("The vehicles name is: " + ford.getName());
		System.out.println("The vehicles number of doors: " + ford.getDoors());
		System.out.println("The vehicles engine capacity is : " + ford.getEngineCapacity() + " cc.");


	}
}