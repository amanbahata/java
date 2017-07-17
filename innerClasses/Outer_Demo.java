/**
*	This program implements inner classess exercise
*	@author Aman Bahata
*/

public class Outer_Demo{


	private class Inner_Demo{     // declared private to restric access from outside the outer class
		public void print(){
			System.out.println("Hello from the inner class !!");
		}
	}

	public void displayInner(){
		Inner_Demo inClass = new Inner_Demo();
		inClass.print();
	}
}