package arraylistExample;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		ArrayList<Integer> number=new ArrayList<Integer>();
		
	
	number.add(1);
	number.add(2);
	number.add(3);
	
	System.out.println("Before remove = "+ number);
	System.out.println("Size = "+ number.size());
	
	number.remove(0);
	//number.clear();// to clear all numbers.
	
	System.out.println(" After remove = "+ number);
	System.out.println(" Size = "+ number.size());
	
	boolean b= number.isEmpty(); // to check empty 
	System.out.println(b);
	
	}

}
