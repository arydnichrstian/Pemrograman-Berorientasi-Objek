
public class main_1 
{

    public static void main(String[] args) 
    {
        DivideByZero divZero = new DivideByZero();
        System.out.println("Hasil = " + divZero.DivideZero(8.8));
        System.out.println("Hasil = " + divZero.DivideZero(10));

        Division div = new Division();
        div.DivOperation();
        System.out.println("Hasil = " + div.Devide(div.numerator, div.denominator));
        div.DivOperation();
        System.out.println("Hasil = " + div.Devide(div.numerator, div.denominator));
    }
}