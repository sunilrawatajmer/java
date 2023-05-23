import java.util.Scanner;
public class ReturnStringFunction {
    public static void main(String[] args) {
        Scanner ob = new Scanner (System.in);
        System.out.println("Enter Two String : ");
        String a=ob.next();
        String b=ob.next();
        String  k = tmp(a,b);
        System.out.println("largest ="+k);
    }

    static String tmp(String x,String y){
      String c=x;
      String d=y;
       int len1= x.length();
        int len2= y.length();
        if(len1>len2)
        return c;
        
        else
        return d;
    }
}
