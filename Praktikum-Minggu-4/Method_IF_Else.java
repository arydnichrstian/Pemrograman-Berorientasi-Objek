public class Method_IF_Else {
	
	static void checkAge(int usia) {
		
		if (usia < 18) {
			System.out.println("Akses ditolak - Anda belum cukup umur!");
			
		}
		
		else {
			System.out.println("Akses diberikan - Anda sudah cukup umur!");
		}
	}
		public static void main(String[] args) {
			checkAge(20);
		}
	
}
