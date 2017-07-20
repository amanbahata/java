import java.util.Scanner;

public class ArraysDemo{

	public static void main(String[] args) {

		int[] myIntegers = getIntegers(5);

		for (int j = 0;j < myIntegers.length ;j++ ) {
			System.out.println("Element " + j + " typed value was : " + myIntegers[j]);
		}
		
	}

	public static int[] getIntegers(int number){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter " + number + " integer values. \r");

		int[] values = new int[number];

		for (int i = 0; i < values.length ; i++ ) {
			values[i] = in.nextInt();
		}

		return values;
	}

}