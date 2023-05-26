import java.util.Scanner;
public class ReturnStringFunction2 {
    public static void main(String[] args) {
        Scanner ob = new Scanner (System.in);
        System.out.println("Enter First String : ");
        String a=ob.next();
        System.out.println("Enter Second String : ");
        String b=ob.next();
        System.out.println("Enter Third String : ");
        String c=ob.next();

        System.out.println("Print Minimum String if Strings Are Not Equal.");
        
        String r=compare(a,b,c);
        System.out.println(" Result = " + r);
    }

    static String compare(String x,String y,String z ){
        int len1=x.length();
        int len2=y.length();
        int len3=z.length();

        if(len1<len2){
            if(len1<len3){
                return x;
            }
        }

        else if(len2<len1){
            if(len2<len3){
                return y;
            }
        }

        else  if{
            if(len3<len1){
                if(len3<len2){
                    return z;
                }
            }
        }

        
        return "Strings Are Equal";
    }
}

