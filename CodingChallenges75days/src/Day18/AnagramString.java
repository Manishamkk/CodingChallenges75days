package Day18;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s1 = "race";//Race
      String s2 = "care";//Care
     // s1 =s1.toLowerCase();
      //s2 = s2.toLowerCase();
      if(s1.length()==s2.length()) {
    	  char[] c1 = s1.toCharArray();
    	  char[] c2 = s2.toCharArray();
    	  Arrays.sort(c1);
    	  Arrays.sort(c2);
    	  boolean result = Arrays.equals(c1, c2);
    	  if(result) {
    		  System.out.println("anagram String:"+ s1 + " and " + s2);
    	  }else {
    		  System.out.println("Not anagram String");
    	  }
      }else {
    	  System.out.println("NOT MATCH");
      }
	}

}
