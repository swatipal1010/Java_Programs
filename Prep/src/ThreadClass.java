
class MyThread1 extends Thread{
	
	public void run(){
		int i=0;
		while(i<=250) {
			System.out.println("Running in MyThread1 class"); 
			i++;
		}	
	}
}

class MyThread2 extends Thread{
	
	public void run(){
		int i=0;
		while(i<=250) {
			System.out.println("Running in MyThread2 class"); 
			i++;
		}	
	}
}

public class ThreadClass {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		t1.start();
		
		MyThread2 t2 = new MyThread2();
		t2.start();
		

	}

}
