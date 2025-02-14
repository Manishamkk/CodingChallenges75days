package Day31;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> list = new LinkedList<>();
		list.add("Java");
		list.add("c++");
		list.add("Python");
		list.add("c#");
		List<String> arr = new ArrayList<>(list);
		for(String s1 : arr) {
			System.out.println(s1);
		}
		//retrieve the first and last elements of the linked list
		String first = list.peekFirst();
		String last = list.peekLast();
		System.out.println(first + "   :  "+ last);
		//check the particuler element are present or not in the list
		if(list.contains("AI/ML")) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
	}
}
