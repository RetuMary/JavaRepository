package throwsAndthrow;

public class SuperWord1 extends SuperWord{

	int age = 3;
	String name ="Retu";
	
	
	void run () {
		System.out.println(super.age+"name"+ super.name); // first class variable print korbe.

		System.out.println(age+name); //this will print immediate class variable.
	
	}
}