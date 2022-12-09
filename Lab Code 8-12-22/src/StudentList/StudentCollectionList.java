package labcodes;

import java.util.ArrayList;

public class StudentCollectionList {

	public String student(int index) {
		ArrayList<String> students = new ArrayList<String>();
		students.add("Tejaswini");
		students.add("Shital");
		students.add("Mona");
		return students.get(index);
	}

}