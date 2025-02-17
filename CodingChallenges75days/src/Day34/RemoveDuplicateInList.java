package Day34;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(10,20,30,10,50,60,70,10);
		 System.out.println("Before Removing:" + list);
       list.stream().collect(Collectors.toSet()).forEach(System.out::println);
	
}

}
