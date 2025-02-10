
package Day8;

import java.util.Arrays;

public class SwappingNumbers {

	public static void main(String[]args) {
		int a = 100;
		int b = 200;
		System.out.println("Before swapping: a is " + a +" b is "+ b);
		a =a+b;
		b =a-b;
		a = a-b;
		
		// second way
		int temp =0;
		temp =  a;
		a=b;
		b = temp;
		System.out.println("After swapping 3 variable: a is " +a + " b is  "   +   b);
		
		int [] arr = {10,29,34,565,787,345,3};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
