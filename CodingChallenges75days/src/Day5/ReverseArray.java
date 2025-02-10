package Day5;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {
	
	//first way using temp array
	
	  public static void reverseArray(Integer arr[] ,int n)
	  { 
//		  Integer [] b = new Integer[n]; 
//		  int j = n; 
//	  for(int i= 0;i<n;i++) 
//	  { 
//		  b[j-1]=arr[i];
//		  j=j-1;
//		  }	
//	//second way using swapping
//	int t;
//	for(int i= 0;i<n/2;i++) {
//		t = arr[i];
//		arr[i]=arr[n-i-1];
//		arr[n-i-1]=t;
//	}
	
	//third way using collections
	Collections.reverse(Arrays.asList(arr));
	System.out.println("After reverse"+Arrays.asList(arr));
	for(int i = 0;i<n;i++) {
		System.out.println("Reverse Number:" + arr[i]);
	}
	
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Integer [] a = {10,20,30,40,50};
		for(int i= 0;i<a.length;i++) {
			System.out.println("Before reverse numbers:"+a[i]);
		}
		reverseArray(a,a.length);
	}

}
