
public class MyThread extends Thread{

	// implement the run method 
	@Override
	public void run(){
		int iterator = 5;

		try{

			for (int i = 0; i < iterator ; i++ ) {
				System.out.println("Output from secondary thread.");
				sleep(5000);
			}
		}catch (InterruptedException e){
			System.err.println(e);
		}
	}
}