import java.util.HashSet;
public class HashSetEqualsMethod {
   public static void main(String[] args) {
       HashSet s1 = new HashSet();

       s1.add("Volvo");
       s1.add("BMW");

       HashSet s2 = new HashSet();

       s2.add("Volvo");
       s2.add("BMW");
       
       //Equals Method(Its Return Boolean Value)
       System.out.println(s1.equals(s2));//true
       System.out.println(s1.equals("Volvo"));//false

   }
}
