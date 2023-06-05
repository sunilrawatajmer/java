//If Givan Number Is Even Then Return True Else Return False

import java.util.Scanner;
public class BooleanUsing
{
    public static void main(String[] args) {
        int n;
    
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter a no.: ");
        n = ob.nextInt();

        boolean z=fun(n);
    
        System.out.print(z);
    }
    static boolean fun(int a){
        if(a%2==0){
            return true;
        }else{
            return false;
        }
    }
}