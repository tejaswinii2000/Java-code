package lab;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapCollection {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();

		// Insertion
		lhm.put(1, "Tejaswini");
		lhm.put(2, "Rohan");
		lhm.put(3, "Monika");
		lhm.put(4, "Raj");
		lhm.put(5, "Neha");
		lhm.put(6, "Vishal");
		System.out.println("Insertion: ");
		for(Map.Entry m: lhm.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
		}
		System.out.println();

		// Updating
		lhm.replace(3, "Swati");
		lhm.replace(6, "Monika");
		lhm.replace(5, "Tejal");
		System.out.println("Updation: ");
		for(Map.Entry m: lhm.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
		}
		System.out.println();

		// Deleting
		lhm.remove(5);
		lhm.remove(2);
		lhm.remove(1);
		System.out.println("Deletion: ");
		for(Map.Entry m: lhm.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
		}
	}

}
