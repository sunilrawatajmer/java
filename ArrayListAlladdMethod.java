import java.util.ArrayList;

public class ArrayListAlladdMethod {
    public static void main(String[] args) {
        ArrayList Ar = new ArrayList ();
        Ar.add(22);
        Ar.add(3);
        Ar.add(4);
        Ar.add(01);
        Ar.add(8928);

        System.out.println("First Arraylist Elements - ");
        System.out.println(Ar);

        ArrayList <String> Ar2 = new ArrayList <String> ();
        Ar2.add("Sunil");
        Ar2.add("Anil");
        Ar2.add("Suraj");
        Ar2.add("Renu");

        System.out.println("Second Arraylist Elements - ");
        System.out.println(Ar2);

        //AllAdd Method
        System.out.println("After Use alladd Method First ArrayList Elements - ");
        Ar.addAll(Ar2);
        System.out.println(Ar);
    }
}