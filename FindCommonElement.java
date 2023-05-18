import java.util.*;
class Common {
    public static void main(String arr[]) {
        int i,j,size;
        int a[],newA[];
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        size=ob.nextInt();
        a=new int[size];
        newA=new int[size];
        System.out.println("Enter 1st Array Elements : ");
        for(i=0;i<a.length;i++){
            a[i]=ob.nextInt();
        }
        
        System.out.println("Enter 2nd Array Elements : ");
        for(j=0;j<a.length;j++){
            newA[j]=ob.nextInt();
        }

        System.out.println("Common Element are -- "); 
        for(i=0;i<a.length;i++){
            for(j=0;j<newA.length;j++){
                if(a[i] == newA[j]){
                    System.out.println(a[i]);
                }
            }
            }
        }
    }
