package revision;
//Searching an element in unsorted array using for-each loop 

public class ForEachLoop2 {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int value = 111;
		boolean found = false;
		
		for(int x: arr) {
			if(x==value) {
				found = true;
			}
		}
		
		if(found)
			System.out.println("Value found");
		else
			System.out.println("Value is not found");
	}

}
