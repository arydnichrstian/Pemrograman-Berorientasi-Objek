
interface TugasMahasiswa {
    void Kuliah();
    void BelajarMandiri();
    void MengembangkanDiri();
}

class Mahasiwa implements TugasMahasiswa {
    public Mahasiwa() {
        System.out.println("Tugas mahasiswa adalah: ");
    }
    @Override
    public void Kuliah() {
        System.out.println("1. Kuliah tepat waktu");
    }
    @Override
    public void BelajarMandiri() {
        System.out.println("2. Belajar mandiri, rajin membaca");
    }
    @Override
    public void MengembangkanDiri() {
        System.out.println("3. Mengembangkan diri melalui pelatihan dan komunitas");
    }
}

public class Interface_Class {
    public static void main(String[] args) {
        Mahasiwa Aryadani = new Mahasiwa();
        Aryadani.Kuliah();
        Aryadani.BelajarMandiri();
        Aryadani.MengembangkanDiri();
    }
}