import java.util.*;
class maximum{
    public static void main(String arr[]) {
        int num1,num2,num3,num4,max=0;
        Scanner ob = new Scanner(System.in);

        System.out.println("Enter 1st Number ");
        num1=ob.nextInt();

        System.out.println("Enter 2nd Number ");
        num2=ob.nextInt();

        System.out.println("Enter 3rd Number ");
        num3=ob.nextInt();
        
        System.out.println("Enter 4th Number ");
        num4=ob.nextInt();

       

        if(num1>num2){
            if(num1>num3){
                max=num1;
            }
            else{
                max=num4;
            }
        }
        
        if(num2>num3){
            if(num2>num4){
                max=num2;
            }
            else{
                max=num4;
            }
        }
        
        if(num3>num1){
            if(num3>num4){
                max=num3;
            }
            else{
                max=num4;
            }
        }
        
        else{
            if(num4>num1){
                if(num4>num2){
                    if(num4>num3){
                        max=num4;
                    }
                    else{
                        max=num2;
                    }
                }
            }
        }
        
        System.out.print("Maximum Number is ="+max);
    }
}