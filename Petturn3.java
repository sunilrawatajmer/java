import java.util.*;
class patt{
    public static void main(String arr[]) {
        int i,j;
        for(i=1;i<=5;i++){
            for(j=5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}