import java.util.Scanner;

public class Simulasi_Login{
    static int count = 0;

    public static void main(String[] args)
    {
        String username,password,data1,data2;

        awal:
        while (true) 
        {
            username = "mahasiswa1";
            password = "jaya.upj";
            Scanner inputUser = new Scanner(System.in);

            System.out.println("----- MENU SIGN IN-----\n");
            System.out.print("Username : ");  data1 = inputUser.next();
            System.out.print("Password : ");  data2 = inputUser.next();

            if ((data1.equals(username)) && (data2.equals(password))) 
            {
                System.out.println("\nHi " + username);
                System.out.println("\nSelamat datang di Halaman Dashboard :)");
                System.exit(1);
            }   else 
            
            {
                System.out.println("\nUsername atau Password anda salah! Silahkan ulangi lagi");
                System.out.print("\n");
                count++;
            }

            if (count == 3) 
            {
                System.out.println("Anda sudah gagal 3 kali, coba lagi nanti.");
                break awal;
            }
        }

    }
}