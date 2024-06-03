package encapsulationDemo;

public class StudentRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Teacher run = new Teacher();
	
	//run.name = "Dev";
	//run.age = 22;
	//run.displayinformation();
	
	run.setName("Deb");
	System.out.println(" Name : " +run.getName());
	
	run.setAge(22);
	System.out.println("Age : "+run.getAge());
	}

}
