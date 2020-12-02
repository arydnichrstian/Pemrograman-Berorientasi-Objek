import java.util.Scanner;

class Bilangan 
{
    private int a;
    private int b;
    private int hasil;

    public void setA(int a) 
    {
        this.a = a;
    }

    public void setB(int b) 
    {
        this.b = b;
    }

    public int getHasil() 
    {
        return hasil;
    }

    public void hasil() 
    {
        try 
        {
          this.hasil = a / b;
        } catch (ArithmeticException e) 
        {
            System.out.println("Terjadi error: " + e);
        }
    }
}

public class Arithmetic_Exception 
{
    public static void main(String[] args) 
    {
        Bilangan bil = new Bilangan();
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan 1: ");
        int a = sc.nextInt();
        bil.setA(a);
        System.out.print("Masukkan bilangan 2: ");
        int b = sc.nextInt();
        bil.setB(b);
        bil.hasil();
        System.out.println("Hasil = " + bil.getHasil());
        System.out.println("Terima kasih");
    }
}