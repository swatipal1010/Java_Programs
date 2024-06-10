
class MyThreadA extends Thread{
	
	public void run(){
		int i=0;
		while(i<=200) {
			System.out.println("Running in MyThreadA class"); 
			i++;
		}	
	}
}

//Using the constructor of the type Thread(String name)
class MyThreadB extends Thread{
	//Constructor to take the name for the thread
	MyThreadB(String name){
		super(name);
	}
	
	public void run(){
		int i=0;
		while(i<=200) {
			System.out.println("Running thread in class 'MyThreadB' and name of the thread is: "+this.getName());
			i++;
		}
	}
}

public class ThreadPriority {

	public static void main(String[] args) {
		MyThreadA tA = new MyThreadA();
		tA.start();
		
		MyThreadB tB = new MyThreadB("Apple");
		tB.start();
		System.out.println("Name of the thread is: "+tB.getName());
		
		MyThreadB tB2 = new MyThreadB("Orange");
		tB2.start();
		System.out.println("Name of the thread is: "+tB2.getName());

		tB.setPriority(Thread.MAX_PRIORITY);
	}

}
