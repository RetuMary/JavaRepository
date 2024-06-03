package passfail;

public class reverseloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = ("Helloworld");
		
		String reversed = "";
		
		for(int i= input.length()-1; i>=0; i-- ) {
		
			
		  reversed = reversed+input.charAt(i);
		
		 // System.out.println("main string:" + input);
	
		//System.out.println("Revered string:" + reversed );
		
	}
		System.out.println("main string:" + input);
		
		System.out.println("Revered string:" + reversed );
		
}
}