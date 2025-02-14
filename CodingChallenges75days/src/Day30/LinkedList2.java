package Day30;

import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> list1 = new LinkedList<>();
		list1.add("suja");
		list1.add("Ashwini");
		list1.add("pratu");
		list1.addFirst("X");
		list1.addLast("Sister");
		LinkedList<String> list2 = new LinkedList<>();
		list2.add("Prakash");
		list2.add("Santosh");
		list2.add("Datta");
		//join list
		list2.addAll(list1);
		System.out.println("After join two list:");
		for(String s : list2) {
			System.out.println(" " + s);
		}
		System.out.println("");
		//clone an linked  list to another linkedlist
		LinkedList<String> list3 = new LinkedList<>();
		list3=(LinkedList<String>) list2.clone();
		for(String s1:list3) {
			System.out.println("After cloning  "  +s1);
		}
	}

}
