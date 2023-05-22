import java.util.Scanner;
public class MaxMinFuncUsing {
    public static void main(String a[]){
        System.out.println("Function For Maximum Number -");
        max();
        System.out.println("Function For Minimum Number -");
        min();
    }

    static void max(){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter Two Numbers : ");
        int a=ob.nextInt();
        int b=ob.nextInt();
        if(a>b){
            System.out.println("Maximum is "+a);
        }
        else{
            System.out.println("Maximum is "+b);
        }

    }

    static void min(){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter Two Numbers : ");
        int a=ob.nextInt();
        int b=ob.nextInt();
        if(a<b){
            System.out.println("Minimum is "+a);
        }
        else{
            System.out.println("Minimum is "+b);
        }
    }
}
