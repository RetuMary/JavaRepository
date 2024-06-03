package javaArrayexercise;

public class MaxminArray10 {

 
	  public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int[]num = {1,2,3,4,5};
	int max = num [0];
	int min = num [0];
	
	for (int i = 1; i<num.length;i++) {
		
	if(num[i]> max) {
		max= num[i];
	}
	if(num[i]<min) {
		min=num[i];
	}}
	
	System.out.println(" maximum value = " + max );
	
	System.out.println(" minimum value = " + min);
	}
	 }
	
	 


