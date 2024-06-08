
class MyThread3 implements Runnable{
	
	public void run() {
		int i=0;
		while(i<=250) {
			System.out.println("Running the thread in MyThread3 using runnable interface");
			i++;
		}		
	}
}

class MyThread4 implements Runnable{
	
	public void run() {
		int i=0;
		while(i<=250) {
			System.out.println("Running the thread in MyThread4 using runnable interface");
			i++;
		}		
	}
}


public class ThreadRunnable {

	public static void main(String[] args) {
		MyThread3 bullet = new MyThread3();
		Thread gun = new Thread(bullet);
		gun.start();
		
		MyThread4 bullet2 = new MyThread4();
		Thread gun2 = new Thread(bullet2);
		gun2.start();


	}

}
