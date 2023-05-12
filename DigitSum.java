import java.util.*;
class table{
    public static void main(String arr[]) {
        int a,r=0,sum=0;
        Scanner ob = new Scanner(System.in);
        
        System.out.print("Enter Number ");
        a=ob.nextInt();

        while(a>0){
            r=a%10;
            sum=sum+r;
            a=a/10;
        }
         System.out.print("Sum of Digits = "+sum);
    }
}