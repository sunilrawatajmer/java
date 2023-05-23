import java.util.Scanner;
public class ReturnStringFunction {
    public static void main(String[] args) {
        Scanner ob = new Scanner (System.in);
        System.out.println("Enter First String : ");
        String a=ob.next();
        System.out.println("Enter Second String : ");
        String b=ob.next();
        String  k = tmp(a,b);
        System.out.println("Result ="+k);
    }

    static String tmp(String x,String y){
       int len1= x.length();
        int len2= y.length();
        if(len1>len2)
        return x;
        else if(len2>len1)
        return y;
        else
        return "Both of Equal";
    }
}
