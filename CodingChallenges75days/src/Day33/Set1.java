package Day33;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> set = new HashSet<>();
		set.add(10);
		set.add(100);
		set.add(1000);
	    set.add(10000);
	    set.add(100000);
	    set.add(10000000);
	    Iterator<Integer> itr = set.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	    System.out.println(set);
	    System.out.println("Size of set : "+ set.size());
	    System.out.println("Set is empty:" + set.isEmpty());
	    System.out.println("remove first elements in set:" + set.remove(10));
	System.out.println(set);
	//hashset using list
	List<Integer>  list = new ArrayList<>(set);
	Iterator<Integer> itr1 = list.iterator();
	while(itr1.hasNext()) {
	System.out.println("by using list : "+ itr1.next());
	}
	// by using array
	Integer[] arr = new  Integer[set.size()];
	set.toArray(arr);
	for(Integer i : arr) {
		System.out.println( " by using array : "+i);
	}
	}

}
