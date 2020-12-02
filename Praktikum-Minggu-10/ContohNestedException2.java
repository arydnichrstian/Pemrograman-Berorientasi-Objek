
public class ContohNestedException2 
{
    public static void main(String[] args) 
    {
        try 
        { // Parent try-block
            try 
            { // Child try-block1
                System.out.println("Di dalam child block 1");
                int b = 30 / 0;
                System.out.println(b);
            } catch (ArithmeticException e) 
            {
                System.out.print("Aritmethic Exception ");
                System.out.println("ditangani pada child try-block1");
            }
            try 
            { // Child try-block2
                System.out.println("Di dalam child block 2");
                int b = 40 / 0;
                System.out.println(b);
            } catch (ArrayIndexOutOfBoundsException e) 
            {
                System.out.print("ArrayIndexOutOfBounds Exception ");
                System.out.println("ditangani pada second try-block");
            }
        } catch (ArithmeticException e) 
        {
            System.out.print("Aritmethic Exception ");
            System.out.println("ditangani pada parent try-block");
        } catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.print("ArrayIndexOutOfBounds Exception ");
            System.out.println("ditangani pada parent try-block");
        } catch (Exception e) 
        {
            System.out.print("Exception ");
            System.out.println("ditangani pada parent try-block");
        } finally 
        {
            System.out.println("Next Statement...");
        }
    }
}