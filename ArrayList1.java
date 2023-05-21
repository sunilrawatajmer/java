import java.util.ArrayList;

public class ArrayList1 {
    public static void main (String a[]){
        ArrayList<Integer>Arr=new ArrayList<>();

        Arr.add(1);
        Arr.add(2);
        Arr.add(3);
        Arr.add(4);
        Arr.add(5);

        System.out.println("ArrayList Data -");
        for(int i=0;i<Arr.size();i++){
            System.out.println(Arr.get(i));
        }
    }
}
