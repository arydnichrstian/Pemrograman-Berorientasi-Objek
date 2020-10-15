import java.util.Scanner;

public class Latihan_Aritmatika {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int panjang, lebar, luas, tinggi, volume;

        //membuat perhitungan menghitung luas Persegi Panjang
        //luas = panjang * lebar

        System.out.println("MENGHITUNG LUAS");
        System.out.printf("panjang = ");
        panjang = userInput.nextInt();
        System.out.print("lebar = ");
        lebar = userInput.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas = " + luas);

        System.out.println("MENGHITUNG VOLUME");
        System.out.print("tinggi = ");
        tinggi = userInput.nextInt();
        volume = luas * tinggi;
        System.out.println("Volume = " + volume);
    }
}