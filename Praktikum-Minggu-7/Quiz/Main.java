package com.Quiz;

import java.util.Scanner;

public class Main 
{      static void soalNomor1() 
    {
        Scanner input = new Scanner(System.in);
        Nomor1 objSoalSatu = new Nomor1();
        double bil1,bil2,bil3;
        System.out.print("Masukkan bilangan 1: ");
        bil1 = input.nextDouble();
        System.out.print("Masukkan bilangan 2: ");
        bil2 = input.nextDouble();
        System.out.print("Masukkan bilangan 3: ");
        bil3 = input.nextDouble();
        objSoalSatu.setInputData(bil1,bil2,bil3);
        objSoalSatu.getData();
    }
    
    static void soalNomor2() 
    {
        Scanner input = new Scanner(System.in);
        Nomor2 objSoalDua = new Nomor2();
        double bil1,bil2,bil3;
        System.out.print("Masukkan Nilai 1: ");
        bil1 = input.nextDouble();
        System.out.print("Masukkan Nilai 2: ");
        bil2 = input.nextDouble();
        System.out.print("Masukkan Nilai 3: ");
        bil3 = input.nextDouble();
        objSoalDua.setInputData(bil1,bil2,bil3);
        objSoalDua.getData();
    }
    
    static void soalNomor3() 
    {
        Scanner input = new Scanner(System.in);
        Nomor3 objSoalTiga = new Nomor3();
        double bil1,bil2,bil3;
        System.out.print("Masukkan bilangan 1: ");
        bil1 = input.nextDouble();
        System.out.print("Masukkan bilangan 2: ");
        bil2 = input.nextDouble();
        System.out.print("Masukkan bilangan 3: ");
        bil3 = input.nextDouble();
        objSoalTiga.setInputData(bil1,bil2,bil3);
        objSoalTiga.getData();
    }
    
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       int pilihan=0;
       while (pilihan != 4) 
       {
           System.out.print("---------------\n"+
                   "     Menu \n" +
                   "---------------\n" +
                   "I)   Soal Nomor 1 \n" +
                   "II)  Soal Nomor 2\n" +
                   "III) Soal Nomor 3\n" +
                   "IV)  Keluar Dari Program\n" +
                   "--------------------\n" +
                   "Apa pilihan Anda [1-4]? ");

           pilihan = input.nextInt();
           switch (pilihan) 
           {
               case 1:
                   System.out.println("\nProses soal nomor 1");
                   soalNomor1();
                   break;
               case 2:
                   System.out.println("\nProses soal nomor 2");
                   soalNomor2();
                   break;
               case 3:
                   System.out.println("\nProses soal nomor 3");
                   soalNomor3();
                   break;
               case 4:
                   System.out.println("\nTelah berhasil keluar dari aplikasi");
                   break;
               default:
                   System.out.println("Maaf, Anda salah pilih menu");
           }
       }
    }
}