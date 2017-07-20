/**
* Exsercise with java built in datastructures
* Arrays and java inbuilt lists
*/

public class Main{
	public static void main(String[] args) {
		
		// Arrays
		int[] myIntArray = new int[10];

		// myIntArray[5] = 50;
		// myIntArray[0] = 70;
		// myIntArray[9] = 100;

		// fill the array with consecutive intigers from 1 - 10

		for (int i = 0; i < myIntArray.length ; i++ ) {
			myIntArray[i] = i + 1;
		}



		double[] myDoubleArray = new double[5];

		myDoubleArray[3] = 0.5;
		myDoubleArray[0] = 1.0;

		System.out.println("Element at index 5 of myIntArray is: " + myIntArray[5]);
		System.out.println("Element at index 3 of myDoubleArray is: " + myDoubleArray[3]);
	}
}