package polymorphism;

public class OverridingRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Overriding1 ob1 = new Overriding1();
		
			ob1.name = " Hari ";
			ob1.age = 30;
			ob1.sub = " QA";
			
			
			ob1.displayinformation();
	
	//overriding class
		
			Overriding ob2= new Overriding();
			
			 ob2.name = " Dev";
			 ob2.age = 32;
			 
			 ob2.displayinformation();
			
			
	}

}
