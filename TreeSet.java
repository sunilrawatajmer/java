import java.util.TreeSet;
public class TreSet {
    public static void main(String[] args) {
        TreeSet s1 = new TreeSet();

        s1.add("Volvo");
        s1.add("BMW");
        s1.add("Ford");
        s1.add("BMW");
        s1.add("Mazda");
        System.out.println(s1.first());
    }
   }