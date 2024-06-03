package javaArrayexercise;

import java.util.Arrays;

public class commonArrayFiften {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[]line1= {1,2,3,4};
	int[] line2 = {1,0,4,5};
	
		System.out.println( " Array line 1 - " + Arrays.toString(line1));
		System.out.println("Array line2 - "+ Arrays.toString (line2));
	
		 for (int i = 0; i < line1.length; i++) {
	            for (int j = 0; j < line2.length; j++) {
		
	            	if (line1[i] == (line2[j])) {
	
	            		System.out.println("Common element is : " + (line1[i]));	}
	            	}
	            }            
		 }
}