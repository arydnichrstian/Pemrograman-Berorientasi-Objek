
class CthClassNotFoundException 
{
    public static void main(String[] args) 
    {
        try 
        {
            ClassLoader.getSystemClassLoader().loadClass("Halo dunia!");

        } catch (ClassNotFoundException e) 
        {
            System.out.println("Class nggak ketemu");
        }
    }
}