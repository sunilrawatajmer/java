import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList2 {
    public static void main(String a[]){

        Scanner ob = new Scanner(System.in);
        ArrayList<String>str=new ArrayList<>();
        String arr[]=new String[5];
        //str ob = new str();
        for(int i=0;i<5;i++){
            System.out.print("Enter String : ");
            str.add(ob.next());
        }

        System.out.println("you Entered : ");
        for(String x : str){
            System.out.println(x);
        }
    }
}
