/*
     
    *
   ***
  *****
 *******
*********

 */
class pat7{
    public static void main(String arr[]) {
        int i,j;
        for(i=1;i<=5;i++){
            for(j=4;j>=i;j--){
                System.out.print(" ");
            }

            for(j=1;j<=i;j++){
                System.out.print("*");
            }

            for(j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}