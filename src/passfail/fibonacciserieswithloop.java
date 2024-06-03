package passfail;

public class fibonacciserieswithloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	         int n= 10,
			firstNumber = 0,
			secondNumber = 1;
	         int nextnumber;
	
	for (int i = 1; i<=n; i++) {
	
		System.out.print(firstNumber + " , ");
		
		
	nextnumber = firstNumber + secondNumber;
    firstNumber = secondNumber;
    secondNumber = nextnumber;
    	
	}
    
	}
	
	
	
	
	}


