import java.util.Scanner;
public class Array_3D2 {
    public static void main(String arr[]){
        Scanner ob = new Scanner(System.in);
        int a[][][] = new int[2][3][4];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<4;k++){
                    a[i][j][k]=ob.nextInt();
                }
            }
        }

        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<4;k++){
                    System.out.print(a[i][j][k]);
                }
            }
        }
    }
    
}
