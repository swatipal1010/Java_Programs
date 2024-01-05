package revision;

public class ForEachMDarray {

	public static void main(String[] args) {
		int twod[][] = new int[3][4];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				twod[i][j] = i+j;
			}
		}

		for(int m[]: twod) {
			for(int n : m) {
				System.out.println("Value is: "+n);
			}
		}
			
	}

}
