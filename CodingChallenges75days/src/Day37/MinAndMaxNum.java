package Day37;

import java.util.Arrays;

public class MinAndMaxNum {

	public static void main(String[] args) {
		int arr[] = {54,86,34,89,1,435,678798,89,9};
	
	System.out.println("Minimum number :"+Arrays.stream(arr).min().getAsInt());
	System.out.println("Maximum number :"+Arrays.stream(arr).max().getAsInt());}
}
