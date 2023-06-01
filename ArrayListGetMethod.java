import java.util.ArrayList;

public class ArrayListGetMethod {
    public static void main(String[] args) {
        ArrayList Ar = new ArrayList ();
        Ar.add("Sunil");
        Ar.add(3);
        Ar.add('c');
        Ar.add(112.03);
        Ar.add("Sunil");

        //Get Method
        System.out.println(Ar.get(3));//112.03
        System.out.println(Ar.get(1));//3
    }
}
