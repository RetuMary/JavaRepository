package javaArrayexercise;

public class javaarrayex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Declare and initialize integer arry.
	
		int Listarray []= {1,2,3,4,5,6,7,8,9,10};
	
		// variable to store sum.
		int sum = 0;
	
		// Iterate over each element of the array using an enhanced for loop.
   for(int i: Listarray )
	// Add each element to the sum.
       sum += i;
		
   System.out.println(" The sum is " + sum );
		
	}

}
