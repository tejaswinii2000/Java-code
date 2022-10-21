package lab;

import java.util,*;

public class HashMapCollection {
	public static void main(String[] args) {
		HashMap<Integer, String> numhm = new HashMap<Integer, String>();

		// Insertion
		numhm.put(1, "Tejaswini");
		numhm.put(2, "Mannu");
		numhm.put(3, "Vishal");
		numhm.put(4, "Raj");
		numhm.put(5, "Akshay");
		numhm.put(6, "Pritam");
		System.out.println("Insertion: ");
		for(Map.Entry m:numhm.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		}
		System.out.println();

		// Deleting
				numhm.remove(3);
				numhm.remove(6);
				System.out.println("Deletion: ");
				for(Map.Entry m:numhm.entrySet()){    
				       System.out.println(m.getKey()+" "+m.getValue());    
				}
				System.out.println();

				// Replacing
				numhm.replace(2, "Mona");
				numhm.replace(5, "Shital");
				System.out.println("Updation: ");
				for(Map.Entry m:numhm.entrySet()){    
				       System.out.println(m.getKey()+" "+m.getValue()); 
		}
	}

}

}
