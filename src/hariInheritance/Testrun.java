package hariInheritance;

public class Testrun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child run = new Child ();
		
		run.name = " Hari";
		run.age= 25;
		run.sub = " QA";
		
		run.displayinformation1();	
	
		Parent sun = new Parent();
		
		sun.name = " Dev";
		sun.age = 26;
	
	
		sun.dispalyinformation();
	
	
	}

}
