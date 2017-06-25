/**
*	This program implements a stack for intigers that is able to gold ten values
*	@author Aman Bahata
*/

public class Stack{

	private int[] stck;
	private int topOfStack;


	// Initialize the stack
	public Stack(int spaces){
		stck = new int[spaces];  
		topOfStack = -1;
	}

	// Push an item into the stack

	public void push(int number){
		int size = stck.length;

		if (topOfStack == (size - 1)) {
			System.out.println("Stack is full !!");
		}

		stck[++topOfStack] = number;

		System.out.println(number + " added to the stack.");
	}

	// Peek the item at the top of the stack

	public void peek(){
		if (topOfStack < 0) {
			System.out.println("Stack is empty !!");
		}
		System.out.println("Item on top of stack: " + stck[topOfStack]);
	}

	// Pop the item at the top of the stack

	public int pop(){
		if (topOfStack < 0) {
			System.out.println("Can not remove an item from an empty stack.");
			return 0;
		}
		int temp = stck[topOfStack];
		topOfStack--;
		return temp;
	}

	// Calculate the size of the stack

	public int size(){
		return stck.length;
	}
}