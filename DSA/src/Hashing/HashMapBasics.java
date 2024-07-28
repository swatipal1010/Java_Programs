package Hashing;
import java.util.*;

public class HashMapBasics {

	public static void main(String[] arg) {
		HashMap<String, Integer> map = new HashMap<>();
		
		//adding values
		map.put("India",100);
		map.put("China",200);
		map.put("USA", 50);
		
		System.out.println(map);
		
		//To check whether the key exists in the map or not
		if(map.containsKey("India")) {
			System.out.println("India as key is present.");
		}
		
		//To retrieve the value of the key 
		System.out.println("Value of the key India is: "+map.get("India"));
		
		
		//Iterating through the map using enhanced for loop
		for(Map.Entry<String,Integer> e: map.entrySet()) {
			System.out.println(e.getKey()+" : "+e.getValue());
		}
		
		
		//to delete an element from the hashmap
		System.out.println("Removed value: "+map.remove("China"));
		
		//To create a set of keys present in the hashmap and then print the hashmap
		Set<String> keys = map.keySet();
		for(String key: keys) {
			System.out.println(key+" : "+map.get(key));
		}
	}

}
