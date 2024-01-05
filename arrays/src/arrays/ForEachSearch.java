package arrays;

public class ForEachSearch {

	public static void main(String[] args) {
		int nums[] = {6,8,3,7,4,2,5};
		int val = 4;
		boolean found = false;
		System.out.println("We are searching for "+val);
		
		for(int x: nums) {
			if(x == val) {
				found = true;
				break;
			}
		}
		if(found)
			System.out.println("Value found!!");
		else
			System.out.println("Couldn't find the value");
	}

}
