
public class ContohArrayIndexOutOfBoundsException 
{
    public static void main(String[] args) 
    {
        try 
        {
            int b[] = {20, 20, 40};
            System.out.println("Nilai : " + b[4]);
            int angka = 7;
            int hasil = angka / 0;
            System.out.println(hasil);
        } catch (ArithmeticException e) 
        {
            System.out.println("Tidak boleh membagi sebuah bilangan dengan nol");
        } catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Data array yang ingin ditampilkan tidak ada");
        } finally 
        {
            System.out.println("Pesan ini dicetak ga ya...");
        }
        System.out.println("Terima Kasih dicetak ga ya...");
    }
}