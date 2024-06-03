package arraylistExample;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> number=new ArrayList<Integer>();
	
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(3,4);
		
		System.out.println("Before remove = "+ number);
		System.out.println("Size = "+ number.size());
		
		boolean index=number.contains(10);
		System.out.println("Index has contain - "+index);
		
	int n = number.indexOf(2);// index value
	System.out.println(n);
	
	number.set(1,5);
	System.out.println(number);
	
	
	
	}

}
