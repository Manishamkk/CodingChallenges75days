package Day14;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str1 = "madam";
    String str2 = "";
    for(int i =str1.length()-1;i>=0;i--) {
    	str2 = str2+str1.charAt(i);
    }
    if(str1.equalsIgnoreCase(str2)) {
    	System.out.println("Palindrome String");
    }else {
    	System.out.println("Not Palindrome string");
    }
	}

}
