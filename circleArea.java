import java.util.*;
class circle{
    public static void main(String arr[]) {
         int r;
         float area, pi = 3.14f;

         Scanner ob = new Scanner(System.in);
        
         System.out.println("Enter Radious ");
         r=ob.nextInt();

         area = pi * r * r;
         System.out.print("Arae of Circle is  "+area);
    }
}