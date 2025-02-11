package Day11;

import java.util.HashMap;

public class OccuranceOfChar {

	
		public static void main(String[] args) {
	        // TODO Auto-generated method stub

//	        String str = "Welcometomyhome";
//	        HashMap<Character, Integer> map = new HashMap<>();
//	        char[] c = str.toCharArray();
//	        for (int i = 0; i < c.length; i++) {
//	            if (map.containsKey(c[i])) {
//	                map.put(c[i], map.get(c[i]) + 1);
//	            } else {
//	                map.put(c[i], 1);
//	            }
//	        }
//	        System.out.println("Occurrence of the character is " + map);
//	   
			
			String  s1 = "ManishaKeshavJadhav";
			HashMap<Character,Integer> map = new HashMap<>();
			char [] c = s1.toCharArray();
			for(int i =0;i<s1.length();i++) {
				if(map.containsKey(c[i])) {
					map.put(c[i], map.get(c[i])+1);
				}else {
					map.put(c[i], 1);
				}
			}
		System.out.println("OCcurance of numbers"+map);
		
		
		}}