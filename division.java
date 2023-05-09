import java.util.Scanner;
class Main
{
    public static void main(String arr[])
    {
        int h,m,e,s,p,t,per;
        Scanner ob = new Scanner(System.in);
        System.out.print("enter the no of hindi . ");
        h = ob.nextInt();
         System.out.print("enter the no of maths . ");
        m = ob.nextInt();
         System.out.print("enter the no of english . ");
        e = ob.nextInt();
         System.out.print("enter the no of science . ");
        s = ob.nextInt();
         System.out.print("enter the no of poltical . ");
        p = ob.nextInt();
        t=h+m+e+s+p;
        System.out.println("total = "+t); 
        per=(t*100)/500;
         System.out.println("persantage = "+per); 
        
        if(per>60&&per<100)
        {
          System.out.println(" 1st division pass ");  
        }

        else if(per<60&&per>40)
        {
          System.out.println(" 2nd division pass ");  
        }
        
        else if(per>25&&per<40)
        {
          System.out.println(" 3rd division pass ");  
        }
        
        else
        {
          System.out.println(" Fail ");  
        }
    }
}