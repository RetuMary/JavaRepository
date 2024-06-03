package DateTimeDemo;

import java.time.ZoneId;
import java.util.Set;

//import java.time.ZonedDateTime;

public class ZoneEample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		//ZonedDateTime zone = ZonedDateTime.now();

		//System.out.println(zone);

	
 Set<String> zoneID=ZoneId.getAvailableZoneIds();
 
		for(String s:zoneID)
		System.out.println(s);
		
		
		//ZoneDateTime zone1=ZoneDateTime.
	
	}

}
