package com.BiodataMahasiswa;

class Data_Mahasiswa
{
    String nim;
    String nama_l;
    String jurusan;
    int angkatan;
}

public class Profil 
{

    public static void main(String[] args) 
    {
        Data_Mahasiswa input = new Data_Mahasiswa();
        input.nama_l = "Dono";
        input.nim = "2019071001";
        input.jurusan = "Ilmu Komunikasi";
        input.angkatan = 2019;

        System.out.println("***^^BIODATA MAHASISWA^^***\n");
        System.out.println("Nama: " +input.nama_l);
        System.out.println("NIM: " + input.nim);
        System.out.println("Jurusan: " + input.jurusan);
        System.out.println("Angkatan: " + input.angkatan);
        System.out.println("\n------------------------------\n");

        DataDiri maha = new DataDiri();

        maha.input_nama("Kasino");
        maha.input_nim("2020071002");
        maha.input_jurusan("Manajemen");
        maha.input_angkatan(2020);
        
        
        System.out.println("Nama = " + maha.nama_ms());
        System.out.println("NIM = " + maha.nim_ms());
        System.out.println("Jurusan = " + maha.jurusan_ms());
        System.out.println("Angkatan = " + maha.angkatan_ms());
        System.out.println("\n------------------------------\n");

        
        System.out.println("Nama : " + maha.Nama());
        System.out.println("NIM : " + maha.NIM());
        System.out.println("Jurusan : " + maha.Jurusan());
        System.out.println("Angkatan : " + maha.Angkatan());

    }
}