import java.util.Arrays;

public class Pengenalan_Array {

    public static void main (String[] args){

        System.out.println("Assignment Array");

        int[] arrayInteger = {1,2,3,4};

        arrayInteger[0] = 11;

        System.out.println(arrayInteger[0]);
        System.out.println(arrayInteger[1]);
        System.out.println(arrayInteger[2]);
        System.out.println(arrayInteger[3]);

        System.out.println("\nDeklarasi Array");
        float[] arrayFloat = new float[5];

        arrayFloat[3] = 11.5f;

        System.out.println(arrayFloat[0]);
        System.out.println(arrayFloat[1]);
        System.out.println(arrayFloat[2]);
        System.out.println(arrayFloat[3]);
        System.out.println(arrayFloat[4]);

        System.out.println(Arrays.toString(arrayInteger));
        System.out.println(Arrays.toString(arrayFloat));

    }
}