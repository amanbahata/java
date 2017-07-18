public class MyRunnable implements Runnable{

	@Override

	public void run(){
		int iterations = 5;

		try{
				for (int i = 0;i < iterations ;i++ ) {
				System.out.println("Output from the third thread");
				Thread.sleep(10000);
			
			}

		}catch(InterruptedException e){
			System.err.println(e);
		}

		
	}
}