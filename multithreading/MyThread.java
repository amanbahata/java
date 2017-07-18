
public class MyThread extends Thread{

	@Override
	public void run(){
		int iterator = 5;

		for (int i = 0; i < iterator ; i++ ) {
			System.out.println("Output from secondary thread.");
			sleep(5000);
		}
	}
}