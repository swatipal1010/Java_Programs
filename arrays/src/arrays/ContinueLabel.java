package arrays;

public class ContinueLabel {

	public static void main(String[] args) {
		outer:
			for(int i=0; i<10; i++) {
				for(int j=0; j<10; j++) {
					if(j>i) {
						System.out.println();
						continue outer;        //specify a label to describe which enclosing loop to continue
					}
					System.out.print(" " + (i*j));
				}
			}
			System.out.println();
	}

}
