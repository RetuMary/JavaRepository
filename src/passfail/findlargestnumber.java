package passfail;

public class findlargestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[]array = new int[] {2,4,6,10, 65,80,22,26,30,40};
	int max = array[0];
	
	for (int i = 0; i< array.length; i++) { 
	
		if(array[i]> max)
	   max = array[i];
		
	
	}
    System.out.println("Largest number from array : " + max);
	
	}  
		
	}


