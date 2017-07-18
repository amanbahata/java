
public class Main {

	public static void main(String[] args) {
		
		int iterations  = 3;

		MyThread thread = new MyThread();

		thread.start();

		for (int i = 0; i < iterations ; i++ ) {
			System.out.println("Output from the main process");
			Thread.sleep(3000);
		}
	}
}