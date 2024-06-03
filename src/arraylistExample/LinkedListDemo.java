package arraylistExample;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 LinkedList<String> names = new LinkedList<>();

	        // Adding elements to the LinkedList
	        names.add("Alice");
	        names.add("Bob");
	        names.add("Charlie");
	        names.add(3,"jhon");
	        
	        // Printing the LinkedList
	        System.out.println("LinkedList: " + names);

	        names.addFirst("jhon");
	        names.addLast("Bob");
	        		
	        for(String n:names) {
	System.out.println(n); // to print jhon name first each loop used. 
	        
	        }
	}
}
