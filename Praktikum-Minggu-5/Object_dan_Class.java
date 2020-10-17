class mahasiswa{
    String nama;
    String NIM;
    String prodi;
    double IPK;
    int umur;
}

public class Object_dan_Class {
    public static void main(String[] args) throws Exception {
        
        // instansiasi / membuat object
        mahasiswa mahasiswa1 = new mahasiswa();
        mahasiswa1.nama = "Aryadani Christian";
        mahasiswa1.NIM = "2019071037";
        mahasiswa1.prodi = "Teknik Informatika";
        mahasiswa1.IPK = 4.0;
        mahasiswa1.umur = 19;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.prodi);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);
        
        System.out.println(" ");
        
        mahasiswa mahasiswa2 = new mahasiswa();
        mahasiswa2.nama = "Budi Setiawan";
        mahasiswa2.NIM = "13305042";
        mahasiswa2.prodi = "Ilmu Perteknikan Duniawi";
        mahasiswa2.IPK = 3.5;
        mahasiswa2.umur = 23;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.prodi);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur);
    }
}