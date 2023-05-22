import java.util.Scanner;
public class JaggedArrayInputUser {
    public static void main(String s[]) {
        Scanner ob = new Scanner(System.in);
        int a[][]=new int [3][];
        a[0]=new int[3];
        a[1]=new int[4];
        a[2]=new int[2];

        System.out.println("Enter Array Elements - ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=ob.nextInt();
            }
        }

        System.out.println("You Entered Array Elements - ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
