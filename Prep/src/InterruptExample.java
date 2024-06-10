class MyNewThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            if (Thread.interrupted()) {
                System.out.println("Thread was interrupted.");
                return; // Exit the loop and end the thread
            }
            System.out.println("Thread is running: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted during sleep.");
                return; // Exit the loop and end the thread
            }
        }
        System.out.println("Thread exiting.");
    }
}

public class InterruptExample {
    public static void main(String[] args) {
        MyNewThread t = new MyNewThread();
        t.start(); // Start the thread

        try {
            Thread.sleep(3000); // Main thread sleeps for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t.interrupt(); // Interrupt the MyThread thread
        System.out.println("Main thread exiting.");
    }
}
