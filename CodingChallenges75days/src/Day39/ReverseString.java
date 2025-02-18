package Day39;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "may name is manisha";
		String reverseString = Arrays.stream(str.split(" "))
				.map(word -> new StringBuffer(word).reverse())
.collect(Collectors.joining(" "));		
	System.out.println(str);
	System.out.println(reverseString);
	}
	

}
