import java.util.ArrayList;
import java.util.Iterator;

public class Belajar_Java_Collection
{

    public static void main(String[] args) 
    {
	ArrayList<String> al = new ArrayList<String>();

	al.add("Hilman");
	al.add("Endy");
	al.add("Tiqa");

	Iterator it = al.iterator();

	while(it.hasNext())
	{
    System.out.println(it.next());
    }
  }
}