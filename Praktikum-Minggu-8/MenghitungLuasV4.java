
abstract class HitungLuasV4 {
    protected double s1;
    protected double s2;

    public HitungLuasV4() {
        this.s1 = 0;
        this.s2 = 0;
    }

    public void setSisi(double s1) {
        this.s1 = s1;
    }

    public void setSisi(double s1, double s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    public double getS1() {
        return s1;
    }

    public double getS2() {
        return s2;
    }
}

interface interfaceHitungLuasV3Mix {
    double getLuas();
}

class SegitigaV4 extends HitungLuasV4 implements interfaceHitungLuasV3Mix {
    @Override
    public double getLuas() {
        double luas = 0.5 * this.s1 * this.s2;
        return luas;
    }
}

class LingkaranV4 extends HitungLuasV4 implements interfaceHitungLuasV3Mix {
    @Override
    public double getLuas() {
        double r = this.s1/2;
        double luas = 3.14 * r * r;
        return luas;
    }
}

public class MenghitungLuasV4 {
    public static void main(String[] args) {
        SegitigaV4 oSegitiga = new SegitigaV4();
        oSegitiga.setSisi(5,2);
        System.out.println("Luas Segitiga = 0.5 x " +
                oSegitiga.getS1() + " x " +
                oSegitiga.getS2() + " = " +
                oSegitiga.getLuas());

        LingkaranV4 oLingkaran = new LingkaranV4();
        oLingkaran.setSisi(10);
        System.out.println("Luas Lingkaran = " + oLingkaran.getLuas());
    }
}