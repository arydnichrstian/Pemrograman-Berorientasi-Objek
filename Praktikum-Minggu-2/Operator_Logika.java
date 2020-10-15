public class Operator_Logika {
    public static void main(String[] args) {

        //operator logika  --> operasi yang bisa kita lakukan kepada tipe data boolean
        // AND, OR, XOR, negasi

        boolean a,b,c;
        // OR / atau (||)

        System.out.println("==== OR (||) =====");
        a = false;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        a = false;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);

        // AND / dan (&&)

        System.out.println("\n==== AND (&&) =====");
        a = false;
        b = false;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c);
        a = false;
        b = true;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c);
        a = true;
        b = false;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c);
        a = true;
        b = true;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c);

        // XOR / exclusive or (^)

        System.out.println("\n==== XOR (^) =====");
        a = false;
        b = false;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = false;
        b = true;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = false;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = true;
        c = (a^b);


        // NOT / negasi --> flipping (!)

        System.out.println("\n==== NEGASI (!) =====");
        a = true;
        c = !a;
        System.out.println(a + " --> (!) = " + c);

        System.out.println("\n==== NEGASI (!) =====");
        a = false;
        c = !a;
        System.out.println(a + " --> (!) = " + c);


    }
}