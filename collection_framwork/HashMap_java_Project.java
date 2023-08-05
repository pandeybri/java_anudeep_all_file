package collection_framwork;

import java.util.HashMap;
public class HashMap_java_Project {

	public static void main(String[] args) {
		
		//create a hash map collection 
		HashMap<Integer, String> name = new HashMap<>();
		name.put(25, "Brijesh");
		name.put(10, "Paresh");
		name.put(45, "Nisha");
		name.put(20, "Ram");
		name.put(2, "Sita");
		name.put(1, "Darshan");

		//print using enhance for loop like for Each loop
		for (String value : name.values()) {
	           System.out.println(value);
	       }
		
	}

}
