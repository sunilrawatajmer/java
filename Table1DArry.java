import java.util.*;
class table {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10};
        Scanner ob = new Scanner(System.in);
        int table,i;
        System.out.println("Enter Table Number : ");
        table = ob.nextInt();
        System.out.println("Table ----");
        for(i=0;i<=10;i++){
            System.out.println(table*a[i]);
        }
    }
}