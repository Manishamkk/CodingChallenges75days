package Day22;

public class SelectionSort {

	public static void main(String[] args) {
		
		int arr[] = {10,39,557,67,334,23,4};
		System.out.println("Before the selction sort");
	for(int i = 0 ;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	for(int i = 0;i<arr.length-1;i++) {
		for(int j =  i+1;j<arr.length;j++) {
			if(arr[j]<arr[i]) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
	}
	System.out.println("After swapping");
	for(int i = 0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	}

}
