package Day23;

import java.util.Arrays;

public class InsertionSort {

	
	public static void sorting(int arr[]) {
		int len = arr.length;
		for(int i = 0;i<arr.length;i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && key <arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,4,1,7,4,8,3,10};
        sorting(arr);
		System.out.println(Arrays.toString(arr));
	}

	

}
