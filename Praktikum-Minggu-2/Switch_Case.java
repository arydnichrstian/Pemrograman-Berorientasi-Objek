import java.util.*;

public class Switch_Case {

    public static void main(String[] args){

        // Switch Case
        String input;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Panggil Nama: ");
        input = inputUser.next();

        // ekspresinya berupa satuan (int,long,byte,short), String, atau enum
        switch(input){
            case "Alok":
                System.out.println("Saya Alok, Hadir...");
                break;
            case "Balmond":
                System.out.println("Saya Balmond Hadir!!!!");
                break;
            case "Camcam":
                System.out.println("Camcam Hadir di sini :)");
                break;
            default:
                System.out.println(input + " Tidak Hadir!!!");
        }

        System.out.println("Selesai Program");
    }
}