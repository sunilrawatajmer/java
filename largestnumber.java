import java.util.*;
class rectangle{
    public static void main(String arr[]) {
         int a,b;

         Scanner ob = new Scanner(System.in);
        
         System.out.println("Enter 1st number ");
         a=ob.nextInt();

         System.out.println("Enter 2nd number ");
         b=ob.nextInt();

         if(a>b){
            System.out.println("Largest Number is "+ a);
         }
         else{
            System.out.println("Largest Number is "+ b);
         }
    }
}