import java.util.Scanner;

public class Program_Biodata 
{
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String nama, nim, fakultas, prodi, angkatan;
		
		System.out.println("===--Biodata Mahasiswa--===");
		
		System.out.println(" ");
		
		System.out.println("(Masukkan data tanpa memakai spasi)");
		
		System.out.println(" ");
		
		System.out.print("Nama: "); nama = input.next();
		System.out.print("NIM: "); nim = input.next();
		System.out.print("Fakultas: "); fakultas = input.next();
		System.out.print("Prodi: "); prodi = input.next();
		System.out.print("Angkatan: "); angkatan = input.next();
		
		System.out.println(" ");
		
		System.out.println("Hi, perkenalkan nama saya " + nama + " dengan NIM " + nim + ".");
		System.out.println("Saya adalah mahasiswa UPJ pada fakultas " + fakultas + "," + " di program studi " + prodi + ".");
		System.out.println("Saya merupakan angkatan " + angkatan + ".");
		System.out.println(" ");
		System.out.println("Terima kasih atas perhatiannya...");
	}

}
