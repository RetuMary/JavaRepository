package DateTimeDemo;

	import java.text.DateFormat;
	import java.text.SimpleDateFormat;
	import java.util.Date;

	

	public class localDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Date date = new Date();
	System.out.println(date);
	
	DateFormat dateformate = new SimpleDateFormat("dd/mm/yyyy");
	
	String localDate = dateformate.format(date);
	
	System.out.println("Local Date : " + localDate);
	}

}
