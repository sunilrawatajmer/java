import java.util.Scanner;
public class FunctionOverLodingFactorial {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = ob.nextInt();
        int f = fact(n);
        System.out.println("fact = "+f);
    }

     static int fact(int x) {
        int z = 1;
       while(x>0)
        {
            z=z*x;
            x--;
        }
        return z;
    }
}
