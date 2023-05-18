import java.util.*;
class StringArray {
    public static void main(String arr[]) {
        int i,size;
        String a[];
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        size=ob.nextInt();
        a=new String[size];
        System.out.println("Enter Elements : ");
        for(i=0;i<a.length;i++){
            a[i]=ob.next();
        }
        
        System.out.println(" You Entered  : ");
        for(i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        
    }
}
