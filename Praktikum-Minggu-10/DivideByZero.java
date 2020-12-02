
public class DivideByZero 
{
    int denominator = 0;
    
    public int DivideZero(int numerator) 
    {
        int result = 0;

        try 
        {
          result = numerator / denominator;
        } catch (Exception e) 
        {
            System.out.println("ERROR: " + e);
        }

        return result;
    }

    public double DivideZero(double numerator) 
    {
        double result = 0;

        try 
        {
            result = numerator / denominator;
        } catch (Exception e) 
        {
            System.out.println("ERROR: " + e);
        }

        return result;
    }
}