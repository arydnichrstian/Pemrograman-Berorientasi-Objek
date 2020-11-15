abstract class Hewan{

    public abstract void suaraHewan();

    public void tidur(){
        System.out.println("Zzz...\n");
    }
}

class Ayam extends Hewan{
    public void suaraHewan(){
        
        System.out.println("Kuukuruyuukkk");
    }
}

class Kucing extends Hewan{
    public void suaraHewan(){

        System.out.println("Meong meong");
    }
}

public class Main1 {

    public static void main(String[] args) {
	Ayam ayamku = new Ayam(); 
        ayamku.suaraHewan();
        ayamku.tidur();
        
    Kucing kucingku = new Kucing();
        kucingku.suaraHewan();
        kucingku.tidur();
    }
}