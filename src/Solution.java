
public class Solution {
	
	
	public int fib(int maxNumber) {
			
		if(maxNumber <= 0) {
			return 0;
		} else if(maxNumber ==1 ) {
			return 1;
		}else {
	       return fib(maxNumber - 1) + fib(maxNumber - 2);
		}
	}
	
  	public static void main(String args[]) {
  		
  		Solution sb = new Solution();
  		System.out.println(":::::Sum:::"+sb.fib(8));      
  	}
  	
}