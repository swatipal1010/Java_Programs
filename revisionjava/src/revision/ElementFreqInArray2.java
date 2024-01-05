package revision;

public class ElementFreqInArray2 {
	
		public static void main(String[] args) {
	        int[] array = {2, 4, 6, 4, 8, 4, 10, 12, 4};

	        countOccurrences(array);
	    }
		
	    public static void countOccurrences(int[] arr) {
	        int[] occurrenceArray = new int[arr.length];

	        for (int i = 0; i < arr.length; i++) {
	            int count = 1;
	            if (occurrenceArray[i] == -1) {
	                continue;
	            }
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                    count++;
	                    occurrenceArray[j] = -1;
	                }
	            }
	            occurrenceArray[i] = count;
	        }

	        System.out.println("Element\tOccurrences");
	        for (int i = 0; i < arr.length; i++) {
	            if (occurrenceArray[i] != -1) {
	                System.out.println(arr[i] + "\t\t" + occurrenceArray[i]);
	            }
	        }
	    }

	    
	}


