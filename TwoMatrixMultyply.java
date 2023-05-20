import java.util.Scanner;
public class TwoMatrixMultyply {
    public static void main(String arr[]){
        Scanner ob = new Scanner (System.in);
        int a[][]=new int[2][2];
        int b[][]=new int[2][2];
        int c[][]=new int[2][2];

        System.out.println("Enter 1st Matrix - ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=ob.nextInt();
            }
        }

        System.out.println("1st Maxrix Is - ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }

        System.out.println("Enter 2nd Matrix - ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b[i].length;j++){
                b[i][j]=ob.nextInt();
            }
        }

        System.out.println("2nd Maxrix Is - ");
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                System.out.print(b[i][j]);
            }
            System.out.println();
        }

        System.out.println("Multiplication Of Two Matrix - ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                c[i][j]=a[i][j]*b[i][j];
                System.out.print(c[i][j]);
            }
            System.out.println();
        }
    }
}
