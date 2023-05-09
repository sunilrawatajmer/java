import java.util.Scanner;
class Main
{
    public static void main(String arr[])
    {
        int a,b,c;
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the no . ");
        a = ob.nextInt();
        b = ob.nextInt();
        c = ob.nextInt();
        if(a>b)
        {
          System.out.println("big="+a);  
        }

        else if(a>c)
        {
            System.out.println("big="+a);    
        }

        else if(b>a)
        {
           System.out.println("big="+b);  
        }

        else if(b>c)
        {
            System.out.println("big="+b);    
        }
        else if(c>a)
        {
           System.out.println("big="+c);  
        }

        else 
        {
            System.out.println("big="+c);    
        }
    }
    
    
}