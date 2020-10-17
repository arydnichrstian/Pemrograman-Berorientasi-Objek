public class Java_Constructors {
	
	int x;
	
	public Java_Constructors(int y) {
		x = y;
	}
	
	public static void main(String[] args) {
		
		Java_Constructors myObj = new Java_Constructors(7);
		System.out.println(myObj.x);
	}

}
