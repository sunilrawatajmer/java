import java.util.*;
class FindAndCount {
    public static void main(String arr[]) {
        int i,size,search,c=0;
        int a[];
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        size=ob.nextInt();
        a=new int[size];
        System.out.println("Enter Elements : ");
        for(i=0;i<a.length;i++){
            a[i]=ob.nextInt();
        }
        
        System.out.println(" You Entered  : ");
        for(i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        
        System.out.print("Enter Search NUmber : ");
        search=ob.nextInt();
        
        for(i=0;i<a.length;i++){
            if(a[i]==search){
               c++;
            }
        }
        System.out.println("Count = "+c);
        

    }
}
