/**
*	This program implements a stack for intigers that is able to gold ten values
*	@author Aman Bahata
*/

public class Stack{

	private int[] stck;
	private int topOfStack;


// Initialize the stack
	public Stack(){
		stck = new int[10];  
		topOfStack = -1;
	}

// Push an item into the stack

	public String push(int number){
		int size = stck.length;

		if (topOfStack == (size - 1)) {
			return "Stack is full !!";
		}

		stck[++topOfStack] = number;

		return  number + " added to the stack.";
	}

}