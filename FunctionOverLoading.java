//Area Of Rectangle,Circle,Trengle  using function OverLoding

import java.util.Scanner;
public class FunctionOverLoading {
    public static void main(String[] args) {
        Scanner ob = new Scanner (System.in);
        System.out.print("Enter Rectangle Length : ");
       int  l=ob.nextInt();
       System.out.print("Enter Rectangle Bridth : ");
       int  b=ob.nextInt();
        fun(l,b);

        float pi = 3.14f;
        System.out.print("Enter Circle Radios : ");
        int  r=ob.nextInt();
        fun(pi,r);

        float s = 0.5f;
        System.out.print("Enter Trengle Base : ");
        int  t=ob.nextInt();
        System.out.print("Enter Trengle Hight : ");
        int  h=ob.nextInt();
        fun(s,t,h);
    }

    static void fun(int x,int y){
        int r=x*y;
        System.out.println("Area of Ractangle = " + r);
    }

    static void fun(float x,int y){
        float r=x*y*y;
        System.out.println("Area of Circle = " + r);
    }

    static void fun(float x,int y,int z){
        float r=x*y*z;
        System.out.println("Area of Trengle = " + r);
    }
}
