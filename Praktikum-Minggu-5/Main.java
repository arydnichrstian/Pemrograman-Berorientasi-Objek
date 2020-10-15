public class Main {

    public static void main(String[] args) {

        Bilangan obil = new Bilangan();
        System.out.println("Nilai A = " + obil.tampilkan_A());
        System.out.println("Nilai B = " + obil.tampilkan_B());
        System.out.println("Nilai C = " + obil.tampilkan_C());

        System.out.println(" ");

        obil.inputA(100);
        System.out.println("Nilai A setelah diinput = " + obil.tampilkan_A());
        
        obil.inputB(200);
        System.out.println("Nilai B setelah diinput = " + obil.tampilkan_B());
        
        obil.inputC(300);
        System.out.println("Nilai C setelah diinput = " + obil.tampilkan_C());

        System.out.println(" ");

        System.out.println("Hasil Pertambahan = " + obil.tambah());
        System.out.println("Hasil Pengurangan = " + obil.kurang());
        System.out.println("Hasil Perkalian = " + obil.kali());
        System.out.println("Hasil Pembagian = " + obil.bagi());
        
        obil.inputData(3,5,2);
        System.out.println("Hasil Penambahan = " + obil.tambah());
    }
}