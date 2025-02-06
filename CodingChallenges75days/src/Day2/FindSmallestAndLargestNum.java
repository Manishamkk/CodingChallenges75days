package Day2;

import java.util.Arrays;
import java.util.Collections;

public class FindSmallestAndLargestNum {

	public static void main(String[] args) {
		int[] a = { 5, 677, 8, 89, 34, 23, };
		int max = a[0];
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Maximum number is :" + max);
		System.out.println("Minimum number is :" + min);

		
		  Integer[] b = {435,457,79,456,23}; int minimum =
		  Collections.min(Arrays.asList(b)); int maximum =
		  Collections.max(Arrays.asList(b)); 
		  System.out.println("Smallest number:" + minimum); 
		  System.out.println("largest number:" + maximum);
		 
		
	}

}
