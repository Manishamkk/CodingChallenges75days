package Day19;

import java.util.Arrays;
import java.util.List;

public class LinearSearch {

	//first way
	public static int linearSearch(int[] arr,int k) {
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]==k) 
				return i;
			}
			return -1;
		}
	
	
	public static void main(String[] args) {
		
		  //int [] a = {10,20,30,40,50,60};
		  //  int key  =60;;
		 //System.out.println("element is found at index:"+linearSearch(a,key));}
	//second way by using collection framework
		
		Integer [] a1 = {10,7658,73,348,37,747,765};
		int key = 747;
		List<Integer> list = Arrays.asList(a1);
		if(list.contains(key)) {
			System.out.println("index of given key is:" +list.indexOf(key));
		}
	}
}
