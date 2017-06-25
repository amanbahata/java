/**
* This program tests the Stack class
* @author Aman Bahata
*/

public class StackTester{
	public static void main(String[] args) {

		Stack stack1 = new Stack(10);
		Stack stack2 = new Stack(5);

		stack1.push(3);
		stack1.peek();
		
		stack1.push(4);
		stack1.peek();

		System.out.println(stack1.pop() + " removed from the stack.");
		stack1.peek();

	
	}
}