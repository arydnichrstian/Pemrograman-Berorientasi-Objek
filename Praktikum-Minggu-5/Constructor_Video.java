class Polos{
    String dataString;
    int dataInteger;
}

class pelajar{
    String nama;
    String NIM;
    String jurusan;

    pelajar(String inputNama, String inputNIM, String inputJurusan){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }
}

public class Constructor_Video {
    public static void main(String[] args) throws Exception {
        
        pelajar pelajar1 = new pelajar("Asep","13305041","Administrasi Perteknikan");
        System.out.println(" ");
        pelajar pelajar2 = new pelajar("Tono","13305042","Teknik Pertambangan");
        
    }
}