package DateTimeDemo;

 	 
 	import java.time.LocalTime;
 	import java.time.format.DateTimeFormatter;


 	public class timeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		LocalTime time = LocalTime.now();
		
		DateTimeFormatter formater = DateTimeFormatter.ofPattern("hh:mm:ss" );

		String 	formatedTime = time.format(formater);
		
		
		System.out.println(time);
		System.out.println(formatedTime);		
}}