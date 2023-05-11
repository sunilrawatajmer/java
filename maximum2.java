import java.util.*;
class biggest{
    public static void main(String arr[]) {
        int a,b,big;
        Scanner ob = new Scanner(System.in);

        System.out.println("Enter 1st number");
        a=ob.nextInt();
        
        System.out.println("Enter 2nd number");
        b=ob.nextInt();
        
        big = a>b?a:b;
        System.out.println("Maximum Number is " + big);
    }
}
        