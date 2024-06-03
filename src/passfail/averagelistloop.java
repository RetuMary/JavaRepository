package passfail;

import java.util.Scanner;

public class averagelistloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	int[] array = {1,2,3,4,5,6,7,8,9,10};
	int length = array.length;
	int sum = 0;
	
	for (int i =0; i<length; i++) {
	sum = sum+array [i]; }
	
		System.out.println(" sum of the array :" + sum);
		float avarage = sum/length;
		
		System.out.println(" avarage of the array :" + avarage);
	}

}
