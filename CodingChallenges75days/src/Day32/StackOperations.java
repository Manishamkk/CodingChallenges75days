package Day32;

import java.util.Stack;

public class StackOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> stack = new Stack<>();
		stack.push(100);
		stack.push(20);
		stack.push(70);
		stack.push(90);
		stack.push(29);
		for(Integer i :stack) {
			System.out.println(i);
		}//pop
		   int e = stack.pop(); 
		   System.out.println("Pop Operations :"+e);
		   //peek
		   int peek = stack.peek();
		   System.out.println( " peek"+peek);
		   //search
		   int search = stack.search(70);
		   System.out.println("search" + search);
		   
		   if(stack.isEmpty()) {
			   System.out.println("Empty");
		   }else {
			   System.out.println("Not Empty");
		   }
		   
	}

}
