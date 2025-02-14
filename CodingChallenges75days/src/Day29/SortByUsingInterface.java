package Day29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortByUsingInterface {
	public static void main(String[] args) {
	 ArrayList<Employee> list = new ArrayList<>();
     list.add(new Employee(2, "Sujata", 90000.0));
     list.add(new Employee(1, "Manisha", 80000.0));
     list.add(new Employee(5, "Pratiksha", 95000.0));
     list.add(new Employee(4, "Shravani", 90000.0));
     list.add(new Employee(3, "Arti", 91000.0));
    
     System.out.println("Before the sorting:");
     for (Employee e : list) {
         System.out.println("id: " + e.getEmpID() + " Name: " + e.getEmpName() + " Salary: " + e.getSalary());
     }
     
     Collections.sort(list);    
     
     System.out.println("After the sorting list:");
     for (Employee e1 : list) {
         System.out.println(e1);
     }
 
		
		  Collections.sort(list,new ByUsingComparator()); 
		  for(Employee e :list) {
		  System.out.println(" id: " + e.getEmpID()+" name: "+e.getEmpName()+" salary: "+e.getSalary());
		  
		  }
		  }

}
