package Day38;

import java.util.Arrays;
import java.util.List;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> words = Arrays.asList("madam");
		boolean palindrome = words.stream().anyMatch(s->s.equals(new StringBuilder(s).reverse().toString())); 
	
	System.out.println("Palindrome String :" + palindrome);}

}
