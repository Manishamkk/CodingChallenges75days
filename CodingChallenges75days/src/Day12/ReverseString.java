package Day12;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//first way using StringBiffer class
		String str  = "Welcome";
		StringBuffer buffer = new StringBuffer();
		buffer.append(str);
		buffer.reverse();
		//System.out.println(buffer);
		
		//Second way is Arrays
		char [] c = str.toCharArray();
		System.out.println("second way");
	    for(int i = c.length-1;i>=0;i--) {
	    	System.out.println(c[i]);
	    }
	 }

}
