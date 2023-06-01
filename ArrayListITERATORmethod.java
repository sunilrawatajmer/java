import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListITERATORmethod {
    public static void main(String[] args) {
        ArrayList<Integer> Al = new ArrayList();
        Al.add(10);
        Al.add(20);
        Al.add(30);
        Al.add(40);
        Al.add(50);

        System.out.println(Al);

        //Iterator method returns the elements in proper sequence
        Iterator itr = Al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
}
}
