
class CthNumberFormatException 
{
    public static void main(String args[])
    {
        try 
        {
            int num = Integer.parseInt("Ohayou sekai, good morning world :v") ;

            System.out.println(num);
        } 
        catch(NumberFormatException e) 
        {
            System.out.println("String tidak bisa diubah jadi Angka");
        }
    }
}