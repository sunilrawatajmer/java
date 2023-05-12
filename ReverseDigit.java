import java.util.*;
class Reverse{
    public static void main(String arr[]) {
        int a,r=0;
        Scanner ob = new Scanner(System.in);
        
        System.out.print("Enter Number ");
        a=ob.nextInt();
       System.out.print("Reverse = ");

        while(a>0){
            r=a%10;
            System.out.print(r);
            a=a/10;
        }
    }
}