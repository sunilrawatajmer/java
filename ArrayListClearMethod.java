import java.util.ArrayList;

public class ArrayListClearMethod {
    public static void main(String[] args) {
        ArrayList Ar = new ArrayList ();
        Ar.add("Sunil");
        Ar.add(3);
        Ar.add('c');
        Ar.add(112.03);
        Ar.add("Sunil");

        //Clear Method
        System.out.println(Ar);
        Ar.clear();
        System.out.println(Ar);


    }
}
