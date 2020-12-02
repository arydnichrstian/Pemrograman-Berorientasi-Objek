import java.util.Scanner;

public class Division 
{
    protected double numerator = 0;
    protected double denominator = 0;

    void DivOperation() 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Numerator = ");
        this.numerator = in.nextDouble();
        System.out.print("Denominator = ");
        this.denominator = in.nextDouble();
    }

public double Devide(double numerator, double denominator)
{
        double result = 0;

        try 
        {
            result = numerator / denominator;
        } catch (Exception errMSG) 
        {
            System.out.println("ERROR: " + errMSG);
        }
        return result;
    }
}