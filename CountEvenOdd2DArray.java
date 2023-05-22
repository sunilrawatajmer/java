// count even or odd
import java.util.Scanner;
    public class CountEvenOdd2DArray
    {
        public static void main(String array[])  
        {
            Scanner ob = new Scanner (System.in);
            System.out.println("Enter Rows And Columns NUmber : ");
            int a=ob.nextInt();
            int b =ob.nextInt();
            int arr[][]=new int[a][b];
            int even=0,odd=0;

            System.out.println("Enter Array Element - ");
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++){
                    arr[i][j]=ob.nextInt();
                }
            }

            System.out.println("You Entered Array Element - ");
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }

            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++){
                    if(arr[i][j]%2==0){
                        even++;
                    }
                    else{
                        odd++;
                    }
                }
                
            }

            System.out.println("Even Number is " +even+" in This Array");
            System.out.println("Odd Number is " + odd+" in This Array");
        }
    }