package Day21;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<Integer> list = Arrays.asList(10,5,2,27,12);
    boolean  yes;
    do {
    	yes = false;
    	for(int i = 1;i<list.size();i++) {
    		if(list.get(i-1) > list.get(i)) {
    			Collections.swap(list, i-1, i);
    			yes = true;
    		}
    	}
    }while(yes);
    System.out.println(list);
}
}