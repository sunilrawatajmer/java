/*

 1) Set is Not index based DataStructure
 2) We can Not Add Duplicate VAlues in Set
 3) We can add only One Null Value
 4) Set Does not Follow Insertion Order

 */
import java.util.Iterator;
import java.util.HashSet;
public class Set {
    public static void main(String[] args) {
        HashSet s1 = new HashSet();

        s1.add("Volvo");
        s1.add("BMW");
        s1.add("Ford");
        s1.add("BMW");
        s1.add("Mazda");
        System.out.println(s1);

        Iterator itr = s1.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
            s1.hashCode();
        }
    }
}
