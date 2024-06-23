package Hashing;
import java.util.*;

//we are given a hashmap(to, from) containing the source and destination of the city using flight
//Source and destination cannot be same and there should be only 1 destination for 1 source
public class TicketItinerary {

	public static ArrayList<String> createItinerary(HashMap<String,String> map) {
		HashSet<String> from = new HashSet<>();
		for(String src: map.keySet()) {
			from.add(src);
		}
		
		HashSet<String> to = new HashSet<>();
		for(String dest: map.keySet()) {
			to.add(map.get(dest));
		}
		
		
		ArrayList<String> itn = new ArrayList<>();
		
		String start = "";
		for(String source: from) {
			if(!to.contains(source)) {
				start = source;
			}
		}
		
		itn.add(start);
		for(String mySrc : to) {
			start = map.get(start);
			itn.add(start);
		}
		
		return itn;
	}
	
	public static void main(String[] args) {
		HashMap<String, String> myItn = new HashMap<>();
		
		myItn.put("Chennai","Bangalore");
		myItn.put("Mumbai", "Delhi");
		myItn.put("Goa","Chennai");
		myItn.put("Delhi","Goa");
		
		ArrayList<String> list = createItinerary(myItn);
		for(String val: list) {
			System.out.print(val+" ->");
		}

	}

}
