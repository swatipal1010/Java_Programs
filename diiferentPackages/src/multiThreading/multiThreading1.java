package multiThreading;

public class multiThreading1 extends Thread {

	public void run() {
		System.out.println("We are inside the class multiThreading1");
		System.out.println("The current thread = "+ this.currentThread());          //Gives reference to currently running thread object
		System.out.println("Is present thread a daemon thread: "+ this.isDaemon()); //Checks if the running thread is Daemon thread
		System.out.println("The active count is: "+ this.activeCount());			//returns number of active threads
	}
	
	public static void main(String args[]) {
		Thread t1 = new Thread(new multiThreading1());
		System.out.println("Is thread t1 is alive before start()? "+ t1.isAlive());	//Checks whether thread is alive or not
		t1.start();
		System.out.println("Is thread t1 is still alive after start()? "+ t1.isAlive());
		
		System.out.println("Name of thread t1: "+t1.getName());   					//Returns name of the invoking thread- Default Name
		
		System.out.println("Group of thread t1 is: "+ t1.getThreadGroup());			//Returns thread group of invoking thread.
																					//Returns null if invoking thread has terminated.
		t1.setName("First Thread");													//Set the name of the invoking thread
		System.out.println("New name of thread t1 is: "+ t1.getName());				//Returns the name of the invoking thread
		
	}
}
