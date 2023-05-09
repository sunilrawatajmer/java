import java.util.Scanner;
class Main
{
    public static void main(String arr[])
    {
        int a;
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the no . ");
        a = ob.nextInt();
        if(a>0)
        {
          System.out.println("number is positive ");  
        }

        else
        {
          System.out.println("number is negative ");  
        }
    }
}