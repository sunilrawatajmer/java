import java.util.*;
class Circle{
    public static void main(String arr[]) {
         int r;
         float per, pi = 3.14f;

         Scanner ob = new Scanner(System.in);
        
         System.out.println("Enter Radious ");
         r=ob.nextInt();

         per = 2* pi * r;
         System.out.print("Perimeter of Circle is  "+per);
    }
}