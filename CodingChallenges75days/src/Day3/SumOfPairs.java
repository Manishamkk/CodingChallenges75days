package Day3;

public class SumOfPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = {20,10,40,10,3,20};
		int num =20;
		if(a.length<2) {
			System.out.println("Array should be containg at least two numbers:");
		
		}else{for(int i =0;i<a.length;i++) {
			for(int j = i+1;i<a.length;i++) {
				int temp = a[i]+a[j];
				if(temp ==num) {
					System.out.println("Pair of this two numbers:"+a[i] + " and" + a[j] +"is equal to given "+num);
				}}
			}
		}
	}

}
