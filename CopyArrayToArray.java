import java.util.*;
class CopyToArry {
    public static void main(String arr[]) {
        int i,size;
        int a[],newA[];
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        size=ob.nextInt();
        a=new int[size];
        newA=new int[size];
        System.out.println("Enter Elements : ");
        for(i=0;i<a.length;i++){
            a[i]=ob.nextInt();
        }
        
        System.out.println("My Array Elements   : ");
        for(i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        System.out.println("New Array Elements   : ");
        for(i=0;i<a.length;i++){
            newA[i]=a[i];
            System.out.println(newA[i]);
        }

    }
}
