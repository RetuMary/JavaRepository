package stringMethod;

public class EqualesMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//String a = "Raya";
	//String b= "Raya";
	//String c="raya"; 
	//System.out.println(a.equals(b));//true case and contant same.
	//System.out.println(a.equals(c));//false case different. 	
		
	//EqualsIgnoreCaseExample	
	//String d = "Retu";

	//System.out.println(a.equalsIgnoreCase(b));//both are same 
	//System.out.println(a.equalsIgnoreCase(c));// ignore case sensitivity.
	//System.out.println(a.equalsIgnoreCase(d));// contant different. 
	
	//StringIsEmptyExample
	   
	//System.out.println(a.isEmpty()); //a string has name so false
	//System.out.println(d.isEmpty()); //false string has a name . 
	
	//String E = "I love my country";
	
	//String[] words=E.split("");
	//System.out.println(E);
	
	// LengthExample.java
	
	//String a = "RayaFlavia";
	//String b = "Rodrigues";
	//System.out.println(" String lenth is = " + a.length());
	//System.out.println(" String lenth is = " + b.length());
	
		//String split
	String a = "Raya Flavia";
	String[] words=a.split("\\s");
	
	for(String w:words) {
		System.out.println(w);
	}
	
	
	
	
	}
	}

