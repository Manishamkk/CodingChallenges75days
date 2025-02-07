package Day4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;

public class RemoveDuplicateNum {

	
	  public static int[] removeDuplicates(int[] array) { return
	  IntStream.of(array).distinct().toArray(); }
	 
	    public static void main(String[] args) {
	   
	        int[] numbers = {1, 2, 2, 3, 4, 4, 5, 6, 6};
	        int[] uniqueNumbers = removeDuplicates(numbers);
	        int len = numbers.length;
	        System.out.println("Array without duplicates: " + Arrays.toString(uniqueNumbers));
	   
	    // second way
	        HashSet<Integer> set = new HashSet<>();
	        for(int i = 0;i<len;i++) {
	        	set.add(numbers[i]);
	        }
	        System.out.println(set);
	        
	        
	    }
	}


