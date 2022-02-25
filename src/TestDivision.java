
public class TestDivision {
	
	
	public static void main(String args[]) {
		String temp = null;
		for(int i=0; i < 20;i++) {
			
			if(i % 2 == 0) {
				temp = "LEFT";
			}else {
				temp = "RIGHT";	
			}
			
			System.out.println("(i/2) : " + (i/2) + "=" + temp );
		}	
	}
}
