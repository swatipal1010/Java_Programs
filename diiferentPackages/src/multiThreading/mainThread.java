package multiThreading;

public class mainThread {

	public static void main(String[] args) {
		Thread t1 = Thread.currentThread(); //Reference of main thread is given to thread 't1'
		
		System.out.println("Current thread: "+ t1);
		System.out.println("Change the name of current thread to MyThread.");
		t1.setName("MyThread");
		System.out.println("New name of thread is: "+t1.getName());
		
		//try block contains the code to be executed by main thread
		try {
			for(int i=0; i<4; i++) {
				boolean B = t1.isAlive();
		System.out.println("Is the thread alive? "+B);
		System.out.println(Thread.currentThread() + "i = "+ i);
		Thread.sleep(1000);											//thread sleeps for 1000 seconds
			}
		}
		
		catch(InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
	}

}
