/**
* This program tests the Stack class
* @author Aman Bahata
*/

public class StackTester{
	public static void main(String[] args) {

		// Create two stacks stack1 and stack2 of sizes 10 and 5 respectively
		Stack stack1 = new Stack(10);
		Stack stack2 = new Stack(5);

		//push varous numbers to stack1
		stack1.push(3);
		stack1.peek();
		
		stack1.push(4);
		stack1.peek();

		System.out.println(stack1.pop() + " removed from the stack.");
		stack1.peek();


		// push continuus numbers to stack2
		for (int i = 0; i < stack2.size() ; i++ ) {
			stack2.push(i);
		}
		stack2.peek();
	}
}