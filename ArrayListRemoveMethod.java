import java.util.ArrayList;

public class ArrayListRemoveMethod {
    public static void main(String[] args) {
        ArrayList<Integer> Arr = new ArrayList<Integer>();
        Arr.add(11);
        Arr.add(12);
        Arr.add(13);
        Arr.add(14);
        Arr.add(15);  
    //Remove Method
        System.out.println("Before Removing ArrayList Elements -  ");
        System.out.println(Arr);

        Arr.remove(0);
        
        System.out.println("After Removing ArrayList Elements -  ");
        System.out.println(Arr);



        ArrayList<Integer> Arr2 = new ArrayList<Integer>();
        Arr2.add(11);
        Arr2.add(12);
        Arr2.add(13);
        Arr2.add(14);
        Arr2.add(15);  
    //removeAll Method
        System.out.println("Before Removing ArrayList Elements -  ");
        System.out.println(Arr2);

        Arr2.removeAll(Arr2);
        
        System.out.println("After Removing ArrayList Elements -  ");
        System.out.println(Arr2);


    }
    
}
