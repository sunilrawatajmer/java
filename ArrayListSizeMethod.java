import java.util.ArrayList;

public class ArrayListSizeMethod {
    public static void main(String[] args) {
        ArrayList <Integer>Ar = new ArrayList <Integer> ();
        Ar.add(22);
        Ar.add(3);
        Ar.add(4);
        Ar.add(01);
        Ar.add(8928);

        //Size Method
       int len = Ar.size();
       System.out.println("ArrayList Size = " + len);
       for(int i=0;i<len;i++){
        System.out.println(Ar.get(i));
       }

    }
}
