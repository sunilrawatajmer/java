import java.util.ArrayList;

public class ArrayListSetMethod {
    public static void main(String[] args) {
        ArrayList Ar = new ArrayList ();
        Ar.add("Sunil");
        Ar.add(3);
        Ar.add('c');
        Ar.add(112.03);
        Ar.add("Sunil");

        //Set Method
        Ar.set(1,"Sunil");
        Ar.set(4,123);
        System.out.println(Ar);
        Ar.set(1,"Rawat");
        System.out.println(Ar);


    }
}
