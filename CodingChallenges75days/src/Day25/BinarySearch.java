package Day25;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer [] a = {10,45,36,78,69,57};
	List<Integer> list = Arrays.asList(a);
	Collections.sort(list);
	System.out.println(list);
	int position = Collections.binarySearch(list, 57);
	System.out.println(position);
	}

}
