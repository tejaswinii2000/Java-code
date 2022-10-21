package lab;

import java.util.*; 

public class TreeMapCollection {
	public static void main(String[] args) {
		TreeMap<Integer,String> tmap=new TreeMap<Integer,String>();
		// Insertion
		tmap.put(1, "Sanju");
		tmap.put(2, "Nikita");
		tmap.put(3, "Priti");
		tmap.put(4, "Swati");
		System.out.println("Insertion: ");
		for(Map.Entry m: tmap.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
		}
		System.out.println();

		// Updation
		tmap.replace(3, "Vishal");
		tmap.replace(4, "Tejaswini");
		System.out.println("Updation: ");
		for(Map.Entry m: tmap.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
		}
		System.out.println();

		// Deletion
		tmap.remove(2);
		tmap.remove(1);
		System.out.println("Deletion: ");
		for(Map.Entry m: tmap.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
		}
		System.out.println();
	}

}
