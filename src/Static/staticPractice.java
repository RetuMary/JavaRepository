package Static;

public class staticPractice {

	
	String stname;
	int stid;
	static  String collegename ;
	
	 static void valu() 
	{ 
	collegename = "UM"; 
	} 
	
	
	staticPractice (int id, String name){ 
		stid = id; 
		stname = name; 
		} 
	
	void display() 
	{ 
	System.out.println(stid+"  "+stname+"  "+collegename); 
	
	System.out.println(" Student data");
	System.out.println("");
	
	}
	

	
	

	public static void main(String[] args) {
			// TODO Auto-generated method stub

		staticPractice.valu();// static methods does not need object. 
		
		staticPractice s1 = new staticPractice(21," ila");
		staticPractice s2 = new staticPractice(22, "Retu");
		
		s1.display();
		s2.display();
		
		}
	
	} 
	

//This is the file I have changed
	
	
	


