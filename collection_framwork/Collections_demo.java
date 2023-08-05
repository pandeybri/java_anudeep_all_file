package collection_framwork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collections_demo {

	public static void main(String[] args) {

		Collection<Integer> value = new ArrayList<>();
		value.add(22);
		value.add(25);
		value.add(55);
		
		//first method to print array by iterator
		Iterator<Integer> i = value.iterator();
		
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		
		//second method by while loop
		Iterator<Integer> j = value.iterator();
		
		while(j.hasNext()) {
			System.out.println(j.next());
		}

		//third method and it is advanced method forEach loop
		for(int k:value) {
			System.out.println(k);
		}
	}

}
