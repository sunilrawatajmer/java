import java.util.*;
class Job{
    public static void main(String arr[]) {
        int num1,num2,num3,max;
        Scanner ob = new Scanner(System.in);

        System.out.println("Enter 1st Number ");
        num1=ob.nextInt();

        System.out.println("Enter 2nd Number ");
        num2=ob.nextInt();

        System.out.println("Enter 3rd Number ");
        num3=ob.nextInt();

       

        if(num1>num2)
        {
            if(num1>num3){
                max=num1;
            }
            else{
                max=num3;
            }
        }

        else
        {
            if(num2>num3){
                max=num2;
            }
            else{
                max=num3;
            }
        }
        
        System.out.print("Maximum Number is ="+max);
    }
}