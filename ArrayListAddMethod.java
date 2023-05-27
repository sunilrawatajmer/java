import java.util.ArrayList;

public class ArrayListAddMethod {
    public static void main(String[] args) {
        ArrayList<Integer> Arr = new ArrayList<Integer>();
        Arr.add(11);
        Arr.add(12);
        Arr.add(13);
        Arr.add(14);
        Arr.add(15);  
    
        System.out.println(Arr);
        System.out.println("First ArrayList Elements -  ");
        for(int i=0;i<Arr.size();i++){
            System.out.println(Arr.get(i));
        }

        ArrayList<String>Arr2 = new ArrayList<String>();

        System.out.println("Second ArrayList Elements -  ");
        Arr2.add("Sunil");
        Arr2.add("Singh");
        Arr2.add("Rawat");
        System.out.println(Arr2);
        for(int i=0;i<Arr2.size();i++){
            System.out.println(Arr2.get(i));
        }
    }
    
}
