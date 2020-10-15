public class Operator_Aritmatika {

    public static void main(String[] args) {
        // Operasi Aritmatika
        int x = 12;
        int y = 5;
        int hasil;

        // 1. Penjumlahan
        hasil = x + y;
        System.out.println(x + " + " + y + " = " + hasil);

        // 2. Pengurangan
        hasil = x - y;
        System.out.printf("%d - %d = %d \n" ,x,y,hasil);

        // 3. Perkalian
        hasil = x * y;
        System.out.printf("%d X %d = %d \n" ,x,y,hasil);

        // 4. Pembagian
        float a = 12;
        float b = 5;
        float hasilfloat;
        hasilfloat = a / b;
        System.out.println(a + " / " + b + " = " + hasilfloat);

        // 5. Modulus
        hasil = x % y;
        System.out.printf("%d %% %d = %d \n" ,x,y,hasil);


    }
}