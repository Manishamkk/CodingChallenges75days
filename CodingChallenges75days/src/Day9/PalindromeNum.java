package Day9;

public class PalindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 161;
		int rem , sum=0;
		int temp = num;
		
		while(num>0) {
			rem= num%10;
			sum= sum*10+rem;
			num = num/10;	
		}
		if(temp==sum) {
			System.out.println("Palindrome number:"+temp);
		}else {
			System.out.println("Not palindrome num:"+temp);
		}
	}

}
