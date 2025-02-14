package Day30;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<String>  list = new LinkedList<>();
		list.add("java");
		list.add("c++");
		list.add("Python");
		list.add("c#");
		list.add("DSA");
		System.out.println(list);
		list.addFirst("c");
		list.addLast("AI");
		System.out.println(list);
		//swap two elements in linked list
		Collections.swap(list, 0, 6);
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println("After shuffle");
		Collections.shuffle(list);
		for(String s1:list) {
			System.out.println(s1);
		}
		System.out.println(list);
		
	}

}
