package ooo;


  // A) The class must be declared as final so that child classes can’t be created.

 final class ImmutableStudent {
	
	//B) Data members in the class must be declared private so that direct access is not allowed.
	
	
	private final String name;
	private final String phoneNo;
	
	
	//A parameterized constructor should initialize all the fields performing a deep copy so that data members can’t be modified with an object reference.
	
	public ImmutableStudent(String name, String phoneNo){
	  this.name = name;
	  this.phoneNo = phoneNo;
	}
	
	  // Method 1
    public String getName() { return name; }
 
    // Method 2
    public String getRegNo() { return phoneNo; }
    
    // Note that there should not be any setters

}
