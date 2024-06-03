package localandinstancevariable;

public class ThisExercise {

	int a = 0;
	
	public ThisExercise (int a) {
	this.a = a; // when class variable and constructor variable name same then use this to initial the value.  
		
		System.out.println(" Inside constructor - " +a);	//parameter a and class level a is same.
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisExercise ob = new ThisExercise (10);
		ThisExercise ob1 = new ThisExercise (20);
		ThisExercise ob2 = new ThisExercise (30);
	}

}
