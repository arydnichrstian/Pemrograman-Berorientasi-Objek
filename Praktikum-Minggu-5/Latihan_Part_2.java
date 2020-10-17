// Pemain
class Pemain{
    String name;
    double health;
    int level;
    // object member
    Senjata Senjata;
    Suit Suit;

    Pemain(String name, double health){
        this.name = name;
        this.health = health;
    }

    void attack(Pemain opponent){
        double attackPower = this.Senjata.attackPower;

        System.out.println(this.name + " attacking " + opponent.name + " with power " + attackPower);
        opponent.defence(attackPower);
    }

    void defence(double attackPower){
        // akan mengambil damage
        double damage;
        if (this.Suit.defencePower < attackPower){
            damage = attackPower - this.Suit.defencePower;
        } else {
            damage = 0;
        }

        this.health -= damage;
        System.out.println(this.name + " gets damage " + damage);
    }
    
    void equipSenjata(Senjata Senjata){
        this.Senjata = Senjata;
    }

    void equipSuit(Suit Suit){
        this.Suit = Suit;
    }

    void display(){
        System.out.println("\nName : " + this.name);
        System.out.println("Health : " + this.health + " hp");
        this.Senjata.display();
        this.Suit.display();
    }
}

// senjata
class Senjata{
    double attackPower;
    String name;

    Senjata(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }

    void display(){
        System.out.println("Senjata : " + this.name + " , attack : " + this.attackPower);
    }
}

// Suit
class Suit{
    double defencePower;
    String name;

    Suit(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }

    void display(){
        System.out.println("Suit : " + this.name + " , defence : " + this.defencePower);
    }
}

public class Latihan_Part_2{

    public static void main(String[] args) {
        
        // membuat object Pemain
        Pemain Pemain1 = new Pemain("Sugab",100);
        Pemain Pemain2 = new Pemain("Fadil",50);

        // membuat object Senjata
        Senjata pedang = new Senjata("pedang",15);
        Senjata ketapel = new Senjata("ketapel",1);

        // membuat object Suit
        Suit bajuBesi = new Suit("baju besi",10);
        Suit kaos = new Suit("kaos",0);
        
        // Pemain 1
        Pemain1.equipSenjata(pedang);
        Pemain1.equipSuit(bajuBesi);
        Pemain1.display();

        // Pemain 2
        Pemain2.equipSenjata(ketapel);
        Pemain2.equipSuit(kaos);
        Pemain2.display();

        System.out.println("\nPERTARUNGAN");
        System.out.println("\nEpisode - 0\n");
        Pemain1.attack(Pemain2);
        Pemain1.display();
        Pemain2.display();
        System.out.println("\nEpisode - Terakhir\n");
        Pemain2.attack(Pemain1);
        Pemain1.display();
        Pemain2.display();
    }
}