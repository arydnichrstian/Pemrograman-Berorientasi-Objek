
public class ContohNestedException1 
{
    public static void main(String[] args) 
    {
        try 
        {
            // main try-block
            try 
            {
                // second try-block
                try 
                {
                    // third try-block
                    int arrBill [] = {1, 2, 3, 4};

                    // Akan menampilkan array pada index di luar arrBill
                    System.out.println(arrBill[10]);
                } catch (ArithmeticException e) 
                {
                    System.out.print("Aritmethic Exception ");
                    System.out.println("ditangani pada third try-block");
                }
            } catch (ArithmeticException e) 
            {
                System.out.print("Aritmethic Exception ");
                System.out.println("ditangani pada second try-block");
            }
        } catch (ArithmeticException e3) 
        {
            System.out.print("Aritmethic Exception ");
            System.out.println("ditangani pada main try-block");
        } catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.print("ArrayIndexOutOfBounds Exception ");
            System.out.println("ditangani pada main try-block");
        } catch (Exception e) 
        { // Exception jika catch yang ditulis sebelumnya tidak dapat menangani
            System.out.print("Exception ");
            System.out.println("ditangani pada main try-block");
        }
    }
}