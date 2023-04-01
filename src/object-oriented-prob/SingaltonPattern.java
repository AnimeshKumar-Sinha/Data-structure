package ooo;

public class SingaltonPattern {
	
	
	// this means that in a JVM SingaltonPattern class will have single instance:
	
	

	public static volatile SingaltonPattern singaltonPatternObj;
	
	
	private SingaltonPattern(){}
	
	
	
	public static SingaltonPattern getInstanceOfSingPtClass() {
		
		
		if(singaltonPatternObj == null) {   // A
			
			synchronized(SingaltonPattern.class) {  //B
				
				singaltonPatternObj = new SingaltonPattern();  // C
				
			 return singaltonPatternObj;
			}
		}else {
			return singaltonPatternObj;
		}
	}
	
	// this is problem of partially constructed object: between // A , //B and //C
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
