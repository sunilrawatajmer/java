import java.util.*;
public class HashSetREMOVEIFmethod {
  
    public static void main(String[] args)
    {

        HashSet<String> students = new HashSet<String>();
  
        students.add("Ram");
        students.add("Mohan");
        students.add("Sohan");
        students.add("Rabi");
        students.add("Shabbir");
  
        //removeIf Method
        students.removeIf(n -> (n.charAt(0) == 'R'));
  
        System.out.println("Students name Does not start with S");
       
        for (String str : students) {
            System.out.println(str);
        }
    }
}