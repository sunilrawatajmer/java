import java.util.ArrayList;

public class ArrayListContainsMethod {
    public static void main(String[] args) {
        ArrayList Ar = new ArrayList ();
        Ar.add(22);
        Ar.add(3);
        Ar.add(4);
        Ar.add(01);
        Ar.add(8928);

        //Contains And containAll Method
        //System.out.println(Ar.contains("ee"));
        //System.out.println(Ar.contains(01));
        //System.out.println(Ar.contains(33));
        System.out.println(Ar.containsAll(Ar));
        Ar.remove(2);
        System.out.println(Ar.containsAll(Ar));
       
    }
}