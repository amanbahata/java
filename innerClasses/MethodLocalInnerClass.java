/**
*	
*	@author Aman Enghida
*/

class MethodLocalInnerClass{

	private int number = 5;

	public MethodLocalInnerClass(int number){
		this.number = number;
	}


	public void createAndRunInnerClass(){

		// inner class local to method
		class InnerClass{
			public void display(){
				System.out.println("Hello from method of inner class, the value of the instance variable is :  " + number);
			}
		}

		// inistantiate inner class
		InnerClass inClass = new InnerClass();
		inClass.display();
	}
}