import java.util.Scanner;
public class ReturnArray1 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter First Number  : " );
        int a = ob.nextInt();
        System.out.println("Enter Second Number  : " );
        int b = ob.nextInt();
        int y[];
        y=fun(a,b);
        System.out.println("Results -  - -");
        for(int v:y){
            System.out.println(v);
        }
    }

    static int[] fun(int x,int y){
        int arr[]=new int [5];
        arr[0]=x+y;
        arr[1]=x-y;
        arr[2]=x*y;
        arr[3]=x/y;
        arr[4]=x%y;
        int tmp[] = arr;
        return tmp;
    }

}
