package collection_framwork;

import java.util.ArrayList;

public class List_demo extends Comimpl{

	public static void main(String[] args) {
		ArrayList<Integer> value = new ArrayList<Integer>();
		value.add(22);
		value.add(25);
		value.add(4);
		value.add(1);
		value.add(55);
		value.add(2,55);
		value.remove(5);
		
		
//		Collections.sort(value);
		
		//forth method to print is 
		value.forEach(System.out::println);//Stream API..Lamda Expression
		
//		Collections.sort(value);//Arrange ascending order
		
//		for(Integer i : value ) {
//			System.out.println(i);
//		}
	}

}
