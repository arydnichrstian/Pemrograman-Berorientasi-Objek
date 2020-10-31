package com.BiodataMahasiswa;

public class DataDiri 
{
    String nama;
    String jurusan;
    String nim;
    long angkatan;

    
    public String nama_ms()
    {
        return this.nama;
    }
    
    public long angkatan_ms()
    {
        return this.angkatan;
    }
    
    public String jurusan_ms()
    {
        return this.jurusan;
    }
    
    public String nim_ms()
    {
        return this.nim;
    }
    
    public void input_nim(String nim_maha)
    {
        this.nim = nim_maha;
    }
    
    public void input_nama(String nama_maha)
    {
        this.nama = nama_maha;
    }
    
    public void input_jurusan(String jurusan_maha)
    {
        this.jurusan = jurusan_maha;
    }
    
    public void input_angkatan(long angkatan_maha)
    {
        this.angkatan = angkatan_maha;
    }

    public String Nama() 
    {
        String nama = "Indro";
        return nama;
    }
    
    public int NIM() 
    {
        int nim = 2021071003;
        return nim;
    }
    
    public String Jurusan() 
    {
        String jurusan = "Teknik Mesin";
        return jurusan;
    }
    
    public int Angkatan() 
    {
        int angkatan = 2021;
        return angkatan;
    }
  
}