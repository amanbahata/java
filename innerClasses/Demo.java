/**
*	@author Aman Bahata
*/

class Demo{

	public static void main(String[] args){

		// Instantiates object of type Outer_Demo
		Outer_Demo outerClass = new Outer_Demo();

		outerClass.displayInner();


		// create instance of MethodLocalInnerClass

		MethodLocalInnerClass local = new MethodLocalInnerClass(5);

		local.createAndRunInnerClass();
	}
}