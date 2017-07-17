/**
*	
*	@author Aman Enghida
*/

class MethodLocalInnerClass{

	private int number = 5;

	public void createAndRunInnerClass(){

		// innder class local to method
		class InnerClass{
			public void display(){
				System.out.println("Hello from method of iiner class " + this.number);
			}
		}

		// inistantiate inner class

		InnerClass inClass = new InnerClass();
		inClass.display;
	}
}