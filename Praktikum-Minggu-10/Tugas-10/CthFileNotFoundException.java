import java.io.*;

class CthFileNotFoundException
{
    public static void main(String[] args) 
    {
        try 
        {
            File file = new File("Hello world...");
            
            FileReader baca = new FileReader(file);
        } catch (FileNotFoundException e) 
        {
            System.out.println("File tidak ketemu");
        }
    }
}