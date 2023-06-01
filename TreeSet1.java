import java.util.TreeSet;
public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet s1 = new TreeSet();

        s1.add("Volvo");
        s1.add("BMW");
        s1.add("Ford");
       // s1.add("BMW");
        s1.add("Mazda");
        s1.notify();
    }
   }