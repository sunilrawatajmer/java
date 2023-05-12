import java.util.*;
class Fact{
    public static void main(String arr[]) {
        int num,a,b=1;
        Scanner ob = new Scanner(System.in);
        
        System.out.print("Enter Number ");
        num=ob.nextInt();

        a=num;
        do{
            b=b*a;
            a--;
        }while(a>0);
        System.out.print(" Factorial = "+b);
    }
}