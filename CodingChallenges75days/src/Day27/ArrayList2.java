package Day27;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {

	public static void main(String[] args) {
		
   List<Integer> list = new  ArrayList<>();
   list.add(10);
   list.add(20);
   list.add(30);
   list.add(40);
   list.add(50);
   System.out.println("list  is emty:" + list.isEmpty() );
   System.out.println("list have more elements:" +list);
   System.out.println("is list size :" + list.size());
	Integer i = list.get(3);
	System.out.println("value of 3 position is:" + i);
	list.set(4, 5);
	System.out.println(list);
	list.remove(2);
	//list.removeAll(list);
	System.out.println(list);
	}
	}
