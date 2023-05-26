import java.util.Scanner;
public class ReturnReverseValues {
    public static void main(String[] args) {
        int y[]={1,2,3,4,5};
        int w[];
         w=fun(y);
         for(int v : w){
            System.out.println(v);
         }
    }

    static int[] fun(int x[]){
        int p[]=new int[5];
        for(int i=4;i>=0;i--){
           // System.out.println(x[i]);
            p[4-i]=x[i];
        }

        return p;
    }

}
