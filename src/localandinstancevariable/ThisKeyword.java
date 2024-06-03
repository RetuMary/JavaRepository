package localandinstancevariable;

public class ThisKeyword {

	String name;
	int age;
	
	
	ThisKeyword( String name,int age){
	
	this.name = name;
	this.age = age;
	}
	void display () {
		System.out.println(" Name - "+ name);
		System.out.println("Age - "+ age);
		
}}
