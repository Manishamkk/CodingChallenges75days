package Day26;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
public class ArraysList {

 public static void main(String[] args) {
	        List<String> list = new ArrayList<>(); // Correct instantiation
            	 list.add("Java Developer");
            	 list.add("Mern Stack Developer");
            	 list.add("Software Developer");
            	 list.add("Software Tester");
            	 list.add("Fullstack Developer");
            	 System.out.println(list.indexOf("Software Tester"));
            	 System.out.println(list.indexOf("Mern Stack Developer"));
            	 System.out.println(list.indexOf("Fullstack Developer"));
            	 
            	 list.add(4,"Automation Testing");
            	 System.out.println(list.indexOf("Automation Testing"));
                 System.out.println(list);
 
 //create  an ArrayList another collection using the ArrayList(Collection c )constructor
                 List<String> newlist = new ArrayList<String>(list);
                 System.out.println(newlist);
                 List<Integer> list2 = new ArrayList<>();
                 list2.add(100);
                 list2.add(1000);
                 list2.add(500);
                 list2.add(900);
                 list2.add(50);
                 System.out.println(list2);
              

 
 }

}
