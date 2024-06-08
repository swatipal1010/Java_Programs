
//Using constructor of the type Thread()
class MyThr1 extends Thread {
	public void run() {
		int i=0;
		while(i<=250) {
			System.out.println("Running the thread in class 'MyThr1'");
			i++;
		}
	}
}

//Using the constructor of the type Thread(String name)
class MyThr2 extends Thread{
	//Constructor to take the name for the thread
	MyThr2(String name){
		super(name);
	}
	
	public void run(){
		int i=0;
		while(i<=250) {
			System.out.println("Running thread in class 'MyThr2'");
			i++;
		}
	}
}


//Using the constructor of the type Thread(Runnable r)
class MyThr3 implements Runnable{
	public void run() {
		int i=0;
		while(i<=250) {
			System.out.println("Running thread in class 'MyThr3'");
			i++;
		}
	}
}

//Using the constructor of the type Thread(Runnable r, String s)
class MyThr4 extends Thread implements Runnable{
	MyThr4(String name){
		super(name);
	}
	public void run() {
		int i=0;
		while(i<=250) {
			System.out.println("Running thread in class 'MyThr4'");
			i++;
		}
	}
}



public class ThreadConstructors {

	public static void main(String[] args) {
	//Using constructor of the type Thread()
		MyThr1 t1 = new MyThr1();
		System.out.println("Id of the running thread is: "+t1.getId());
		t1.run();
		
	//Using the constructor of the type Thread(String name)
		MyThr2 t2 = new MyThr2("Swati1Thread");
		System.out.println("Name of the running thread is: "+t2.getName());
		System.out.println("Id of the running thread is: "+t2.getId());
		t2.run();
		
	//Using the constructor of the type Thread(Runnable r)
		MyThr3 tr3 = new MyThr3(); 
		Thread t3 = new Thread(tr3);
		System.out.println("Id of the running thread is: "+t3.getId());
		tr3.run();
		
	//Using the constructor of the type Thread(Runnable r, String s)
		MyThr4 tr4 = new MyThr4("Swati2Thread"); 
		Thread t4 = new Thread(tr4);
		System.out.println("Id of the running thread is: "+t4.getId());
		tr4.run();
	}

}
