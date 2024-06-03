package arraylistExample;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	TreeMap<Integer,String> map = new TreeMap<Integer,String>();
	
	map.put(1,"Ila");
	map.put(2, "Retu");
	map.put(3, "Sumi");
	
	for(Map.Entry m:map.entrySet()){
	
	System.out.println(m.getKey() + " " + m.getValue()); // to print number and name. 
	}

}}
