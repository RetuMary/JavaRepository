package arraylistExample;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	HashSet<String>colours = new HashSet<String>();
	
	
	colours.add("red"); // duplicate name supported.
	colours.add("red");
	colours.add("green");
	
	System.out.println(colours);
	
	
	boolean empty = colours.isEmpty();
	System.out.println(" List is empty - "+ empty);
	
	for (String col:colours) {
	
	System.out.println(col);
	}

}}
