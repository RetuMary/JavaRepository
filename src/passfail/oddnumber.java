package passfail;

public class oddnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 30;
		System.out.println("List of odd numbers from 1 to " + number+":");
		
		for (int i=1; i<=30; i++) {
	if (i % 2 == 1) {
		System.out.println(i);
		}
		}
}
}