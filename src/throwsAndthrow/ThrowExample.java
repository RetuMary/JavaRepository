package throwsAndthrow;

public class ThrowExample {

	

	 static void valid(int age) {  
        if(age<18) {
	
     throw new ArithmeticException ("Person is not eligible to vote");    
        } 
        else {  
            System.out.println("Person is eligible to vote!!");  
        }
        
        }	
        	public static void main(String[] args) {
		// TODO Auto-generated method stub
        		try {
        		valid(14);
        		}catch (ArithmeticException e) {
        			System.out.println(e);
        		}
                System.out.println("rest of the code...");  
	
	
	}

}
