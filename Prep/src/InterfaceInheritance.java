
interface SampleInterface{
	void meth1();
	void meth2();
}

interface ChildSampleInterface extends SampleInterface{
	void meth3();
	void meth4();
}

class MySampleClass implements ChildSampleInterface{
	public void meth3() {
		System.out.println("Implemented meth3 from ChildSampleInterface");
	}
	
	public void meth4() {
		System.out.println("Implemented meth4 from ChildSanpleInterface");
	}
	
	public void meth1() {
		System.out.println("Implemented meth1 from SampleInterface");
	}
	
	public void meth2() {
		System.out.println("Implemented meth2 from SampleInterface");
	}
}



public class InterfaceInheritance {

	public static void main(String[] args) {
		MySampleClass obj = new MySampleClass();
		obj.meth1();
		obj.meth2();
		obj.meth3();
		obj.meth4();

	}

}
