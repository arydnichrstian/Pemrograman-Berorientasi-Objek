
class CthRuntimeException 
{
    public static void main(String[] args) 
    {
        try
        {
            int x=7/0;

            System.out.println(x);
        } 
        catch(RuntimeException e)
        {
            System.out.println("Runtime Error :(");
        }
    }
}