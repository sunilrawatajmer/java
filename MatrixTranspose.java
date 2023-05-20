import java.util.Scanner;
class MatrixTranspose{
    public static void main(String arr[]) {
    int a[][];
    Scanner ob = new Scanner(System.in);
    a=new int [3][3];

    System.out.println("Enter Matrix Element --");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            a[i][j]=ob.nextInt();
        }
    }

    System.out.println("Matrix is --");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.print(a[i][j]);
        }
        System.out.println();
    }

    System.out.println("Matrix Transpose is --");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.print(a[j][i]);
        }
        System.out.println();
    }

}
}