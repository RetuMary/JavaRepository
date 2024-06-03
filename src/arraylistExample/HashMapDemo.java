package arraylistExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	HashMap<Integer,String> HM = new HashMap<Integer,String>();
	
	HM.put(1, "Ila"); //put method for hashmap.
	HM.put(2, "Retu");
	HM.put(3, "Sumi");
	
	System.out.println(HM.get(1)); // to print one value. 
	
	//System.out.println(HM.)need to know if wants to print all value. 
	
	for (Map.Entry m: HM.entrySet()) {
		
	System.out.println(m.getKey()+ " " + m.getValue()); // for all value search with key. 
	
	
	}}

}
