import java.util.*;
class FoeEachLoop {
    public static void main(String a[]){
        Scanner ob = new Scanner (System.in);
        int arr[]=new int[5];
        System.out.println("Enter Arry Elements :");

        for(int k : arr){
            arr[k]=ob.nextInt();
        }

        System.out.println("You Entered---");
        for(int i : arr){
            System.out.println(i);
        }
    }

}
