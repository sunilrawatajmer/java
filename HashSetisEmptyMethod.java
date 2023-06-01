import java.util.HashSet;
public class HashSetisEmptyMethod {
   public static void main(String[] args) {
       HashSet s1 = new HashSet();

       s1.add("Volvo");
       s1.add("BMW");
       s1.add("Ford");
       s1.add("BMW");
       s1.add("Mazda");
       //isEmpty Method(Return Boolean Value)
       System.out.println(s1.isEmpty());

   }
}
