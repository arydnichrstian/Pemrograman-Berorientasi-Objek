import java.util.Arrays;

public class LoopingArray_ForEach {

    public static void main(String[] args){

    	
        int[] arrayAngka = {11,12,13,14,15,16,17,18,19,20};


        System.out.println("Looping standard");
        for(int i = 0; i < 10; i++){
            System.out.println("Index ke-"+i+" adalah = " + arrayAngka[i]);
        }

        
        System.out.println("\nlooping dengan properti length");
        for(int i = 0; i < arrayAngka.length; i++){
            System.out.println("index ke-"+i+" yaitu = " + arrayAngka[i]);
        }


        System.out.println("\nLooping for each");
        for( int angka : arrayAngka){
            System.out.println("Angka pada looping ini = " + angka);
        }


    }
}