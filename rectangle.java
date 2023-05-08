import java.util.*;
class Rectangle{
    public static void main(String arr[]) {
         int l,b,area;

         Scanner ob = new Scanner(System.in);
        
         System.out.println("Enter Length ");
         l=ob.nextInt();

         System.out.println("Enter breadth ");
         b=ob.nextInt();

         area = l * b;
         System.out.print("Arae of Rectangle is  "+area);
    }
}