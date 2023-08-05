package collection_framwork;

import java.util.ArrayList;

public class Student_ArrayList {

	public static void main(String[] args) {

		//create object for display method 
		Student_ArrayList obj = new Student_ArrayList();
		obj.Display();

	}
	//create non static method as display
	public void Display() {
		ArrayList<Object> name = new ArrayList<>();
		name.add("brijesh");
		name.add("nisha");
		name.add("Atul");
		name.add("Raj");
		name.add("Alex");
		name.add("ROck");
		name.add("John");
		name.add("malina");
		name.add("Salen");
		name.add("rocky");
		
		//using lamda expression for each loop
		name.forEach(System.out::println);
	}

}
