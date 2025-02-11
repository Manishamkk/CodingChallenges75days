package Day13;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str = "indiaisthebest";
     HashSet<Character> set = new HashSet<>();
     LinkedHashSet<Character> set2 = new LinkedHashSet<Character>();
     for(int i = 0;i<str.length();i++){
    	 set.add(str.charAt(i));
    	 set2.add(str.charAt(i));
     }
     for(Character ch : set) {
    	 System.out.println(ch);
     }
     for(Character ch2 : set) {
    	 System.out.println(ch2);
     }
	}

}
