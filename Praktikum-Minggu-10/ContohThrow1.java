
public class ContohThrow1 
{
    public static void main(String[] args) 
    {
        try {
            int umur = 17;
            if (umur < 18) 
            {
                throw new ArithmeticException("Access denied");
            } else 
            {
                System.out.println("Access granted");
            }
        } catch (ArithmeticException e) 
        {
            System.out.println(e.getMessage());
        }
    }
}