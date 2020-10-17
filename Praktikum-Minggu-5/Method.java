class Maba{
    String nama;
    String NIM;

    Maba(String nama, String NIM){
        this.nama = nama;
        this.NIM = NIM;
    }

    void show(){
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM  : " + this.NIM);
    }

    void setNama(String nama){
        this.nama = nama;
    }

    String getNama(){
        return this.nama;
    }

    String getNIM(){
        return this.NIM;
    }

    String sayHi(String message){
        return message + " juga, nama saya adalah " + this.nama;
    }
}

public class Method{
    public static void main(String[] args) {
        Maba Maba1 = new Maba("Ucup","13305041");
        Maba1.show();
        Maba1.setNama("Najwa");
        Maba1.show();

        System.out.println(Maba1.getNama());
        System.out.println(Maba1.getNIM());

        String data = Maba1.sayHi("tampan");
        System.out.println(data);
    }
}