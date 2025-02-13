package Day28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList3 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Aarti");
		list.add("Shyam");
		list.add("komal");
		list.add("pooja");
		list.add("Aman");
		System.out.println(list);
		list.size();
		System.out.println(list);
		  System.out.println("index of komal:" + list.indexOf("komal"));
		// normal Iterations
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}

		// by using listIterator
		ListIterator<String> listItr = list.listIterator();
		while (listItr.hasPrevious()) {
			String sub = listItr.previous();
			System.out.println(sub);
		}
		  for(int i = 0;i<list.size();i++) {
			  System.out.println(list.get(i));
		  }
		  List<Integer> list2 = new ArrayList<>();
		  list2.add(10);
		  list2.add(23);
		  list2.add(30);
		  list2.add(45);
		 System.out.println(list2);
	}
	

}
