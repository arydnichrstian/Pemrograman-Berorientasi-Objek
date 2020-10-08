public class Kalkulasi_Method {

	static int kalkulasi(int x,int y) {
		return x + y;
	}
	
	static double kalkulasi(double x,double y) {
		return x - y;
	}
	
	static String kalkulasi(String x, String y) {
		String hasil = x + " " + y;
		
		return hasil;
	}
	
	static String kalkulasi(String x, int y) {
		String hasil = "Nama " + x + ", umur " + y + " tahun";
		
		return hasil;
	}
	
	public static void main(String[] args) {
        int myNum1 = kalkulasi(8, 5);
        double myNum2 = kalkulasi(4.3, 6.26);
        String myNum3 = kalkulasi("Andi", 17);
        String myNum4 = kalkulasi("Arya", "Banez");
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
        System.out.println("Keterangan: " + myNum3);
        System.out.println("Nilai String " +myNum4);
        
    }

}