import java.util.ArrayList;

public class ArrayListCloneMethod {
    public static void main(String[] args) {
        ArrayList Ar = new ArrayList ();
        Ar.add(22);
        Ar.add(3);
        Ar.add(4);
        Ar.add(01);
        Ar.add(8928);

        //Clone Method
        ArrayList Ar2 = new ArrayList ();
        Ar2.clone();
        System.out.println(Ar);
       
    }
}