package com.Quiz;

import java.util.Scanner;

public class Nomor4 {
	
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 Rental rent = new Rental();
		 
		 String user;
		 String status;
		 double internet;
		 double pengetikan;
		 double gaming;
		 int scan;
		 int printMono;
		 int printWarna;
		 int tehBotol;
		 
		 System.out.println("===== Warnet Connect =====");
		 System.out.println(" ");
		 System.out.println("PENGGUNAAN (Dalam Menit)");
		 System.out.print("Nama = ");                                user = input.nextLine();
		 System.out.print("Status (SD/SMP/SMA/Kuliah/Bekerja)? ");   status = input.nextLine();
		 System.out.print("Memakai Internet = ");                    internet = input.nextDouble();
		 System.out.print("Mengetik = ");                            pengetikan = input.nextDouble();
		 System.out.print("Main Game = ");                           gaming = input.nextDouble();
		 System.out.println(" ");
		 System.out.println("Fasilitas Tambahan");
		 System.out.print("Scanning = ");                            scan = input.nextInt();
		 System.out.print("Printing Black & White = ");              printMono = input.nextInt();
		 System.out.print("Printing Colors = ");                     printWarna = input.nextInt();
		 System.out.print("Minum Teh Botol = ");                     tehBotol = input.nextInt();
		 System.out.println(" ");
		 System.out.println("PROFIL PELANGGAN");
		 
		 rent.setNama(user);
		 rent.setStatus(status);
		 rent.setInternet(internet);
		 rent.setKetik(pengetikan);
		 rent.setGame(gaming);
		 rent.setScan(scan);
		 rent.setPrintHP(printMono);
		 rent.setPrintWarna(printWarna);
		 rent.setMinum(tehBotol);
		 
		 System.out.println("Nama Pelanggan: " + rent.getNama());
		 System.out.println("Statusnya: " + rent.getStatus());
		 System.out.println("Internetan: " + rent.getInternet() + " Menit");
		 System.out.println("Ngetik: " + rent.getKetik() + " Menit");
		 System.out.println("Gaming: " + rent.getGame() + " Menit");
		 System.out.println("NgeScan: " + rent.getScan() + " File");
		 System.out.println("NgePrint Hitam-Putih: " + rent.getPrintHP() + " Lembar");
		 System.out.println("NgePrint Berwarna: " + rent.getPrintWarna() + " Lembar"); 
		 System.out.println("Pesan Minuman: " + rent.getMinum() + " Botol");
		 System.out.println(" ");
		 System.out.println("TAGIHAN PEMAKAIAN RENTAL");
		 rent.warnet();
		 
	}

}

class Pelanggan{
	private String _user;
	private String _status;
	
	public void setNama(String user) { this._user = user; }
	public String getNama() {return this._user;}
	
	public void setStatus(String status) { this._status = status; }
	public String getStatus() {return this._status;}
	
}

class Rental extends Pelanggan{
	
	 double internet;
	 double pengetikan;
	 double gaming;
	 int scan;
	 int printMono;
	 int printWarna;
	 int tehBotol;
	 
	 public double getInternet() { return internet; }
	 public void setInternet(double internet) { this.internet = internet; }
	 public double getKetik() { return pengetikan; }
	 public void setKetik(double pengetikan) { this.pengetikan = pengetikan; }
	 public double getGame() { return gaming;}
	 public void setGame(double gaming) { this.gaming = gaming; }
	 public int getScan() { return scan; }
	 public void setScan(int scan) { this.scan = scan; }
	 public int getPrintHP() { return printMono; }
	 public void setPrintHP(int printMono) { this.printMono = printMono; }
	 public int getPrintWarna() { return printWarna; }
	 public void setPrintWarna (int printWarna) { this.printWarna = printWarna; }
	 public int getMinum() { return tehBotol; }
	 public void setMinum(int tehBotol) { this.tehBotol = tehBotol; }
	 
	 void warnet()
	 {
		 double TotalBiaya;
		 double JumInternet;
		 double JumPengetikan;
		 double JumGaming;
		 int JumScan;
		 int JumPrintMono;
		 int JumPrintWarna;
		 int JumTehBotol;
		 
		 JumInternet = (internet/60) * 4000;
		 JumPengetikan = (pengetikan/60) * 2000;
         JumGaming = (gaming/60) * 5000;
         JumScan = scan * 1000;
         JumPrintWarna = printWarna * 500;
         JumPrintMono = printMono * 300;
         JumTehBotol = tehBotol * 3000;
         TotalBiaya = JumInternet + JumPengetikan+ JumGaming + JumScan + JumPrintWarna + JumPrintMono + JumTehBotol;
         
         System.out.println("Biaya Internet : Rp. " + JumInternet);
         System.out.println("Biaya Mengetik : Rp. " + JumPengetikan);
         System.out.println("Biaya Main Game : Rp. " + JumGaming);
         System.out.println("Biaya Scanning : Rp. " + JumScan);
         System.out.println("Biaya Print Hitam-Putih : Rp. " + JumPrintMono);
         System.out.println("Biaya Print Warna : Rp. " + JumPrintWarna);
         System.out.println("Biaya Beli Teh Botol : Rp. " + JumTehBotol);
         System.out.println(" ");
         System.out.println("Total Tagihan Anda Sebesar = Rp. " + TotalBiaya);
         System.out.println(" ");
         System.out.println("Terima kasih, sampai bertemu lagi...");
		 
	 }
	 
}