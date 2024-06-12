
//Using constructor of the type Thread()
class MyNewThr1 extends Thread {
	public void run() {
		int i=0;
		while(i<=250) {
			System.out.println("Running the thread in class 'MyNewThr1'");
			i++;
		}
	}
}

class MyNewThr2 extends Thread {
	public void run() {
		int i=0;
		while(i<=250) {
			System.out.println("Running the thread in class 'MyNewThr2'");
			try {
				Thread.sleep(355);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			i++;
		}
	}
}

public class ThreadMethods {

	public static void main(String[] args) {
		MyNewThr1 t1 = new MyNewThr1();
		MyNewThr2 t2 = new MyNewThr2();
		
		t1.start();
		
		//To ensure that t2 thread runs only after completion of thread t1, we use join() method with t1 thread
		try {
			t1.join();
		}catch( Exception e) {
			System.out.println(e);
		}
		
		t2.start();

	}

}
