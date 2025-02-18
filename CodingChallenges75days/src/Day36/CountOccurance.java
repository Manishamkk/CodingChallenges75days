package Day36;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "hi how are you";
		char[] charr  = str.replaceAll(" " , "").toCharArray();
		Map<Character ,Long> map = new LinkedHashMap<Character,Long>();
	  for(int i = 0;i<charr.length;i++) {
		  map.compute(charr[i],(key , value) ->(value == null)? 1 : value+1);
	  }
	  map.entrySet().forEach(System.out::println);	}

}
