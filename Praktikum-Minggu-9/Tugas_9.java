package PBOreg;

import java.util.Scanner;

public class Tugas_9
{
   public static void main(String[] args)
   {
	  boolean ulang = true;
	  
	  do
	  {
      int angka, bilangan, cari, array[];
      Scanner input = new Scanner(System.in);
      
      System.out.print("Berapa banyak nilai yang ingin diinput? "); bilangan = input.nextInt(); 
     
      array = new int[bilangan]; 
      System.out.println("\nMasukkan " + bilangan + " bilangan tersebut: ");
      for (angka = 0; angka < bilangan; angka++) 
    	   array[angka] = input.nextInt();

      System.out.print("\nAngka berapa yang akan Anda cari datanya = "); cari = input.nextInt();
      for (angka = 0; angka < bilangan; angka++)
      {
         if (array[angka] == cari) 
         {
           System.out.println("\n" + cari + " terdapat di posisi "+(angka+1)); break;
         }
      }        
         if (angka == bilangan) 
         {
           System.out.println("\n" + cari + " tidak tersedia dalam array.");
         }
         
         System.out.print("\nIngin mencoba lagi? (true/false) "); ulang = input.nextBoolean();
         System.out.println("\n");
	  } while (ulang == true);
   }
}