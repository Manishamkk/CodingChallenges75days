package Day1;

import java.util.HashMap;

public class DuplicateNumInArray {

	public static void main(String[] args) {
		
		/*int[] a = {10,30,29,10,29,56};
		for(int i = 0;i<a.length;i++) {
			for(int j = i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("Duplicate numbers :"+a[j]);
				}
			}*/
		//}
		
		 int[] a = {10, 30, 29, 10, 29, 56};
	        HashMap<Integer, Integer> hash = new HashMap<>();

	        for (int i = 0; i < a.length; i++) {
	            if (hash.containsKey(a[i])) {
	                hash.put(a[i], hash.get(a[i]) + 1);
	            } else {
	                hash.put(a[i], 1);
	            }
	        }
	        System.out.println("Counting the numbers:"+hash);
	}
}
