import java.util.Scanner;
class MatrixRowsSum {
    public static void main(String arr[]){
        Scanner ob = new Scanner (System.in);
        int a[][]=new int[3][3];

        System.out.println("Enter Matrix - ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=ob.nextInt();
            }
        }


        System.out.println("Maxrix Is - ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }

        System.out.println("Maxrix Row Sum - ");
        for(int i=0;i<a.length;i++){
           int rowsum=0;
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]);
                rowsum=rowsum+a[i][j];
            }
            System.out.println(" ="+rowsum);
        }

    }
}
