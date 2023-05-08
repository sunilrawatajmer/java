import java.util.*;
class sum{
    public static void main(String arr[]) {
         int a,b,sum=0;

         Scanner ob = new Scanner(System.in);
        
         System.out.println("Enter 1st Number ");
         a=ob.nextInt();

         System.out.println("Enter 2nd Number ");
         b=ob.nextInt();

         sum = a + b;
         System.out.print("Sum of Two Numbers Are "+sum);
    }
}