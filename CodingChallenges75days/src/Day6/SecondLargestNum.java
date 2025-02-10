package Day6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestNum {
	//first way swapping
	public static int  secondLargestNum(Integer a[] ,int total) {
//
//		int temp ;
//		for(int i = 0;i<total;i++) {
//			for(int j = i+1;j<total;j++) {
//				if(a[i]>a[j]) {
//					temp = a[i];
//					a[i] =a[j];
//					a[j] = temp;
//					
//				}
//			}
		//return a[total-2];
		//second way
		//Arrays.sort(a);
		//return a[total-2];
		
		//third way
		List<Integer> list=Arrays.asList(a);
		Collections.sort(list);
		int elements =list.get(total-2);
		return elements;
		}	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Integer a[] = {4,6,7,43,23,13,67};
      System.out.println("Second largest number is:"+   secondLargestNum(a,a.length));
	}

}
