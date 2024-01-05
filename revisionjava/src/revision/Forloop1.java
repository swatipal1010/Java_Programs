package revision;

public class Forloop1 {

	public static void main(String[] args) {
		int i;
		boolean done = false;
		
		i=0;
		for( ;!done; ) {						//Initialization and iteration part are kept empty inside the 'for' loop
			System.out.println("i is: "+i);
			if(i==10) done = true;				//Termination condition for 'for' loop
			i++;
		}

	}

}
