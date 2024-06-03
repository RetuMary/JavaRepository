package arraylistExample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		ArrayList<String> list=new ArrayList<String>();//<String>when declare specific data. we cant use other data type. 
	
		list.add("Blue");
		list.add("White");
		list.add("Red");
		list.add("Black");
		//list.remove(1); //remove 1 value. 
	
		list.add(4,"purple");
		
		System.out.println(list);
		//System.out.println(" Size = " + list.size());// to know the array size. 
		
		for (String arr: list){//for each loop
		System.out.println(" size = " + arr);  // to know individual name. 
		
		
		//Iterator<String> i = list.iterator();// if want to print each and one value.
        //while (i.hasNext()) {
          //  System.out.println(i.next());
        }
	
	}
}
