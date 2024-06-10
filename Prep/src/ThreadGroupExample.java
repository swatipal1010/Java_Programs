
class MyThread extends Thread {
    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " is executing.");
        try {
            Thread.sleep(2000); // Simulate some work with sleep
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted.");
        }
        System.out.println(Thread.currentThread().getName() + " has finished execution.");
    }
}


public abstract class ThreadGroupExample {

	public static void main(String[] args) {
		// Creating a thread group
        ThreadGroup group = new ThreadGroup("MyThreadGroup");

        // Creating threads and assigning them to the thread group
        MyThread t1 = new MyThread(group, "Thread-1");
        MyThread t2 = new MyThread(group, "Thread-2");
        MyThread t3 = new MyThread(group, "Thread-3");

        // Starting the threads
        t1.start();
        t2.start();
        t3.start();

        // Displaying thread group information
        System.out.println("Thread Group Name: " + group.getName());
        System.out.println("Active Thread Count: " + group.activeCount());

        // Listing all threads in the group
        group.list();

        // Waiting for all threads to finish
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        // Checking active thread count after threads have finished
        System.out.println("Active Thread Count after completion: " + group.activeCount());

	}

}
