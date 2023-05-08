import java.util.*;
class rectangle{
    public static void main(String arr[]) {
         int l,b,per;

         Scanner ob = new Scanner(System.in);
        
         System.out.println("Enter Length ");
         l=ob.nextInt();

         System.out.println("Enter breadth ");
         b=ob.nextInt();

         per = 2*(l + b);
         System.out.print("Perimeter of Rectangle is  "+per);
    }
}