package classes;

public class keywords {

	public static void main(String[] args) {
		 try{  
		       
		      int data=100/0;  
		   }catch(ArithmeticException e){System.out.println(e);}  
		      
		   System.out.println("rest of the code...");  
		 
		 /*finally {
			 System.out.println("Finally is always executed");
		 }*/
	}

}
