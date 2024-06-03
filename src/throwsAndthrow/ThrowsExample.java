package throwsAndthrow;

public class ThrowsExample {

	static void valid(int age) throws ClassNotFoundException {  
        if(age<18) {
	
     throw new ClassNotFoundException ("Person is not eligible to vote");    
        } 
        else {  
            System.out.println("Person is eligible to vote!!");  
        }
	
        }	
        	public static void main(String[] args) {
		// TODO Auto-generated method stub
        		try {
        			valid(19);
        		}catch (ClassNotFoundException e) {
        			System.out.println(e);
        		}
                System.out.println("rest of the code...");
	
	
	
	
        	

	}

}
