import java.util.*;
class fact{
    public static void main(String arr[]) {
        int num,a,b=1;
        Scanner ob = new Scanner(System.in);
        
        System.out.print("Enter Number ");
        num=ob.nextInt();

        a=num;
        while(a>0){
            b=b*a;
            a--;
        }
        System.out.print(" Factorial = "+b);
    }
}