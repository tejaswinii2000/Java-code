package lab;

import java.util.*;

public class StudentDetails {
	public static void main(String[] args) {
		ArrayList<String> arrlist = new ArrayList<String>();
		// Adding student name
		arrlist.add("Rohini");
		arrlist.add("Sonali");
		arrlist.add("Manasi");
		arrlist.add("Rani);
		arrlist.add("Shital");
		arrlist.add("Raj");

		ListIterator<String> stud = arrlist.listIterator();

		// Printing student name in forward direction
		while(stud.hasNext()) {
			System.out.println(stud.next());
		}
		System.out.println();

		// Printing student name in backward direction
		while(stud.hasPrevious()) {
			System.out.println(stud.previous());
		}
	}
}
