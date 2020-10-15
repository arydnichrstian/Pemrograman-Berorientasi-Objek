public class Multiple_Objects {
		
		int x = 5;
		
		public static void main(String[] args) {
			Multiple_Objects myObj1 = new Multiple_Objects();
			Multiple_Objects myObj2 = new Multiple_Objects();
			myObj2.x=25;
			System.out.println(myObj1.x);
			System.out.println(myObj2.x);
		}

}