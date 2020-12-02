import java.io.*;

class CthIOException 
{
    public static void main(String[] args) 
    {
        try 
        {
            File file = new File("Bonjour monde :)");
            FileReader fr = new FileReader(file.getAbsoluteFile());

        } catch (IOException e) 
        {
            System.out.println("Input/Output error nih");
        }
    }
}