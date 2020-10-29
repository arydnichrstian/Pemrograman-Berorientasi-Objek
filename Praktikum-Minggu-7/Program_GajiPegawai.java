import java.util.Scanner;

public class Program_GajiPegawai 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        Karyawan_ peg = new Karyawan_();

        String nama;
        String nip;
        String golonganDarah;
        String jabatan;
        int jamKerja;
        int umur;
        int golongan;

        System.out.println("###**Silahkan masukkan Data Diri Saudara**###");
        System.out.println(" ");
        System.out.println("INPUT");
        System.out.print("Nama = ");              nama = input.nextLine();
        System.out.print("NIP = ");               nip = input.nextLine();
        System.out.print("Goldar = ");            golonganDarah = input.nextLine();
        System.out.print("Jabatan = ");           jabatan = input.nextLine();
        System.out.print("Usia = ");              umur = input.nextInt();
        System.out.print("Jam kerja = ");         jamKerja = input.nextInt();
        System.out.print("Golongan Pekerja = ");  golongan = input.nextInt();
        System.out.println(" ");
        System.out.println("BIODATA KARYAWAN");

        peg.setNama(nama);
        peg.setNip(nip);
        peg.setUmur(umur);
        peg.setGolDarah(golonganDarah);
        peg.setJabatan(jabatan);
        peg.setJamKerja(jamKerja);
        peg.setGolongan(golongan);

        System.out.println("Nama: " + peg.getNama());
        System.out.println("NIP: " + peg.getNip());
        System.out.println("Golongan Darah: " + peg.getGolDarah());
        System.out.println("Jabatan: " + peg.getJabatan());
        System.out.println("Usia: " + peg.getUmur() + " Tahun");
        System.out.println("Jam Kerja: " + peg.getJamKerja() + " Jam");
        System.out.println("Golongan Pekerja: " + peg.getGolongan());
        System.out.println(" ");
        System.out.println("RINCIAN GOLONGAN KE - " + golongan);
        peg.gaji();

    }

}

class Orang_
{
    private int _umur;
    private String _nama;
    private String golDarah;
    
    public void setUmur(int umur){ this._umur = umur; }
    public void setNama(String nama){ this._nama = nama; }
    public void setGolDarah(String golDarah){ this.golDarah = golDarah; }
    public int getUmur (){ return this._umur; }
    public String getGolDarah (){ return golDarah; }
    public String getNama (){ return this._nama   ; }

}

class Karyawan_ extends Orang_
{
    String nip;
    String jabatan;
    int golongan;
    int jamKerja;

    public int getGolongan() { return golongan; }
    public void setGolongan(int golongan) { this.golongan = golongan; }
    public int getJamKerja() { return jamKerja; }
    public void setJamKerja(int jamKerja) { this.jamKerja = jamKerja; }
    public String getNip() { return nip; }
    public void setNip(String nip) { this.nip = nip; }
    public String getJabatan() { return jabatan; }
    public void setJabatan(String jabatan) { this.jabatan = jabatan; }
    public static double persenPajak(double a, int b){ return a / b; }

    void gaji() 
    {
        int gajipokok = 0;
        int tunjangan = 0;
        int gajilembur;
        int totalgaji;
        int lembur;
        double gajipajak;

        if (golongan == 1) 
        {
            gajipokok = 1486500;
            tunjangan = 300000;
        }
        if (golongan == 2) 
        {
            gajipokok = 1926000;
            tunjangan = 300000;
        }
        if (golongan == 3) 
        {
            gajipokok = 2456700;
            tunjangan = 350000;
        }
        if (golongan == 4) 
        {
            gajipokok = 2899500;
            tunjangan = 400000;
        }
        if (jamKerja <= 172) 
        {
            lembur = 0;
            System.out.println("Mohon maaf, Anda tidak memperoleh uang lembur");
            System.out.println(" ");
        }
        else {
            lembur = jamKerja - 173;
        }
        
        gajilembur = lembur * 20000;
        totalgaji = gajipokok + tunjangan + gajilembur;
        double Pajak = persenPajak(0.5, 100) * totalgaji;

        System.out.println("Gaji Pokok Anda  = Rp. " + gajipokok);
        System.out.println("Tunjangan Anda   = Rp. " + tunjangan);
        System.out.println("Gaji Lembur Anda = Rp. " + gajilembur);
        gajipajak = totalgaji - Pajak;
        System.out.println(" ");
        System.out.println("Total pendapatan Anda adalah : RP. " + gajipajak);
        System.out.println(" ");
        System.out.println("Terima Kasih...");

    }
}