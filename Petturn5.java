import java.util.*;
class pat5{
    public static void main(String arr[]) {
        int i,j;
        for(i=1;i<=5;i++){

            for(j=1;j<i;j++){
                System.out.print(" ");
            }

            for(j=i;j<=5;j++){
                System.out.print("*");
            }

        
            System.out.println();
        }
    }
}