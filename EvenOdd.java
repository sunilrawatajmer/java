import java.util.Scanner;
class Main
{
    public static void main(String arr[])
    {
        int a;
        Scanner ob = new Scanner(System.in);
        System.out.print("enter the no . ");
        a = ob.nextInt();
        if(a%2==0)
        {
          System.out.println("number is even "+a);  
        }

        else
        {
          System.out.println("number is odd "+a);  
        }
    }
}