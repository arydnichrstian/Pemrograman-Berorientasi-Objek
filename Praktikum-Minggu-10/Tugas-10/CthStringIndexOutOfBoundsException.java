
class CthStringIndexOutOfBoundsException
{
    public static void main(String []args)
    {
        try 
        {
            String a = "Hola mundo";
            char c = a.charAt(30);
            System.out.println(c);
        }
        catch(StringIndexOutOfBoundsException e) 
        {
            System.out.println("Regex melebihi panjang string");
        }
    }
}