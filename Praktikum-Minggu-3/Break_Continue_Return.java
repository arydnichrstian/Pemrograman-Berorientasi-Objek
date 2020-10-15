public class Break_Continue_Return {

    public static void main (String[] args){

        // break, continue, dan return

        int a = 0;

        while(true){
            a++;

            if(a == 10){
                break;
                // Ini adalah keyword untuk memaksa keluar dari loop
            } else if(a == 5){
                continue;
                // Ini adalah keyword untuk memaksa memulai aksi dari awal
            } else if (a == 7){
                return;
            }

            System.out.println("looping ke - " + a);

        }

        System.out.println("Akhir dari looping");

    }
}