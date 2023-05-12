import java.util.*;
class factorial{
    public static void main(String arr[]) {
        int num,i,b=1;
        Scanner ob = new Scanner(System.in);
        
        System.out.print("Enter Number ");
        num=ob.nextInt();
        
        for(i=1;i<=num;i++){
            b = b * i;
        }

        System.out.print(" Factorial = "+b);
    }
}