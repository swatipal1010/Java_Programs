package Hashing;
import java.util.*;

public class HashMapImplementation {

    static public class HashMap<K, V> {
        public class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // Number of total nodes in the linked lists
        private int N; // Number of buckets in the array
        private LinkedList<Node> buckets[]; // Declaring an array of linkedlist of type node

        
        // Constructor of HashMap<K,V> class
        public HashMap() {
            this.N = 4; // Whenever a hashmap is constructor is called, create 4 bucket in the array of linked list
            this.buckets = new LinkedList[N]; // Assigning memory to the array of linked list. Its size is equal to the number of buckets in the array.

            for (int i = 0; i < N; i++) {
                this.buckets[i] = new LinkedList<>(); // Initializing empty linked list at each index of the buckets[] array
            }
        }
        

        // Implementation of hashmap
        // Hash function that returns the bucket index where key should be looked for or should be inserted
        private int hashFunc(K key) {
            int bi = key.hashCode(); // bi = bucket index (where key should be looked for or should be inserted)
            return Math.abs(bi) % N;
        }
        

        // Method to find the key in the linkedlist present at a particular bucket
        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi]; // Got the linked list present at bi index of the array
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key.equals(key)) {
                    return i;
                }
            }
            return -1;
        }

        
        // put() method
        public void put(K key, V value) {
            int bi = hashFunc(key);
            int di = searchInLL(key, bi);

            if (di == -1) { // key doesn't exist already in the linked list at bi
                buckets[bi].add(new Node(key, value)); // If key doesn't exist there earlier, we create a node in that LL to add key and value by creating a new node
                n++;
            } else {
                Node node = buckets[bi].get(di); // We get the node which already holds the key that we want to insert
                node.value = value; // Updating the node's key value with the new value
            }

            // Making sure that lambda doesn't cross the threshold
            double lambda = (double) n / N;
            if (lambda > 2.0) { // 2 is the threshold value
                rehash();
            }
        }

        
        // Rehashing function
        private void rehash() {
            LinkedList<Node> oldBuckets[] = buckets; // Copying the old buckets array content to oldBuckets array
            N = 2 * N;
            buckets = new LinkedList[N];

            // Creating empty linked list at each bucket of the new larger array
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            // Taking out nodes one-by-one from the oldBuckets array and putting them to the large size buckets array
            for (int i = 0; i < oldBuckets.length; i++) {
                // Retrieve the linked list in different buckets of the old small array
                LinkedList<Node> ll = oldBuckets[i];

                // Taking out nodes one-by-one from the considered linked list at a particular bucket of the old array and insert these nodes to the new array's linked list
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value); // Again calling put() method to insert the key and value of the obtained node from the old small array to the new large array
                }
            }
        }
        
        
        //get function
        public V get(K key) {
        	int bi = hashFunc(key);
            int di = searchInLL(key, bi);

            if (di == -1) { // key doesn't exist already in the linked list at bi
                return null;		//If key isn't found in the linkedlist of any bucket, we return null
            } else {
                Node node = buckets[bi].get(di); 	// We get the node which already holds the key that we want to insert
                return node.value;					//If we get the key we're looking for, we return the value of that key
            }
        }
        
        //contains function
        public boolean contains(K key) {
        	int bi = hashFunc(key);
            int di = searchInLL(key, bi);

            if (di == -1) { // key doesn't exist already in the linked list at bi
                return false;		//If key isn't found in the linkedlist of any bucket, we return false
            } else {
               return true;			//If key is found in the linkedlist of any bucket, we return true
            }
        }
        
        //remove function
        public V remove(K key) {
        	int bi = hashFunc(key);
            int di = searchInLL(key, bi);

            if (di == -1) { // key doesn't exist already in the linked list at bi
                return null;		//If key isn't found in the linkedlist of any bucket, we return false
            } else {
            	Node node = buckets[bi].remove(di);		//Remove the node containing the key being passed to this function
            	n--;									//After removing the node, decrease the no. of nodes by 1
               return node.value;						//return the value of the key of the node being removed
            }
        }
        
        //isEmpty() Function
        public boolean isEmpty() {
        	return n==0;			//HashMap is empty if it contains no nodes, then return true
        }
        
        
        //keySet() Function - return an arraylist of keys of Hashmap
        public ArrayList<K> keySet(){
        	ArrayList<K> keys = new ArrayList<>();		//ArrayList that will store the keys
        	
        	for(int i=0;i<buckets.length;i++) {			//Traversing through each bucket one-by-one
        		LinkedList<Node> ll = buckets[i];		//Getting linkedlist present in each bucket
        		for(int j=0; j<ll.size();j++) {			//Traversing through the linked list
        			Node node = ll.get(j);				//get the node at jth index of the LL
        			keys.add(node.key);					//adding key to the Arraylist
        		}
        	}
        	return keys;								//return ArrayList of keys
        }
    }

    
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("cherry", 3);
        
        System.out.println("Value of the key 'apple' is: "+map.get("cherry"));
        System.out.println("Value of the key 'orange' is: "+map.get("orange"));
        
        System.out.println("Does the map contains 'apple' key? "+map.contains("apple"));
        System.out.println("Does the map contains 'orange' key? "+map.contains("orange"));
        
       System.out.println("Removed value: "+map.remove("banana"));
       
       ArrayList<String> keys = map.keySet();
       System.out.print("Keys present in the HashMap are: ");
		for(String key: keys) {
			System.out.print(key+" ");
		}

        
        
    }
}
