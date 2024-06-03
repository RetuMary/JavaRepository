package localandinstancevariable;

public class InstanceVariable {

	int ab = 100; //class variable,
	static int temp = 50;// static variable.
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InstanceVariable ob = new InstanceVariable ();
		 
		ob.localvar();
		ob.localvar1();
		staticvar1();
		staticvar2();
		
	}
	
	public  void localvar() {
		
		int a = 10;
	System.out.println(a);
	System.out.println(ab+10);
}
	public  void localvar1() {
		
		int a = 20;
	System.out.println(a);
	System.out.println(ab+100);

}
	public static void staticvar1() {
		temp = temp +10 ;
		System.out.println(temp);
	}

	public static void staticvar2() {
		temp = temp +100 ;
		System.out.println(temp);
	}


}