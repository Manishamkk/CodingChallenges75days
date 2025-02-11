package Day16;

public class ReplaceTheSpaceOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// replace the spaces of any character
		String str = "knowledge is source of power";
		char ch = '_';
		str=str.replace(' ', ch);
		System.out.println("String after the replacing:");
		 System.out.println(str);
	}

}
