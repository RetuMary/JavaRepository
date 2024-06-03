package arraylistExample;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> set=new TreeSet<String>();
	
		 set.add("Ila");  
         set.add("Retu");  
         set.add("Sumi"); 
         
         System.out.println("Print element through Iterator in unorganied order");  
         
         System.out.println(set);
        
         Iterator i=set.descendingIterator();
         
        while(i.hasNext()) { 
           System.out.println(i.next()); 
	
	}
	}

}