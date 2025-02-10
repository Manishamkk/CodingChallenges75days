package Day10;

public class ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num = 153;
     int rem,sum=0;
     int temp = num;
     while(num>0) {
    	 rem = num%10;
    	 sum= sum+(rem*rem*rem);
    	 num = num/10;
     }
     if(temp ==sum ) {
    	 System.out.println("armstrong number:"+temp);
     }
     else {
    	 System.out.println("not armstrong numners:" +temp);
     }
	}

}
