import java.util.Scanner;
class TwoDarray{
    public static void main(String arr[]) {
    int a[][];
    Scanner ob = new Scanner(System.in);
    a=new int [3][3];
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            a[i][j]=ob.nextInt();
        }
    }

    System.out.println("You Entered --");

    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.print(a[i][j]);
        }
        System.out.println();
    }

}
}