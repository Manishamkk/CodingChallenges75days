package Day35;

import java.util.Arrays;
import java.util.List;

public class SumOfList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(10,20,30,40,50);
		System.out.println("sum od list:" + list.stream().mapToInt(Integer::intValue).sum());
	}

}
