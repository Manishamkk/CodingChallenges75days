package Day17;

public class SwapTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1= "Hello";
		String s2 = "Mansiha";
		System.out.println("Before swapping:" + s1 + " and " +s2);
	s1 = s1+ s2;
	s2 = s1.substring(0,(s1.length()-s2.length()));
	s1 = s1.substring(s2.length());
	System.out.println("After swapping:" + s1 + " and " + s2);
	
	}

}
