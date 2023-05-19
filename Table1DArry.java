import java.util.*;
class arrayTable {
    public static void main(String[] args) {
        int a[];
        Scanner ob = new Scanner(System.in);
        int table,i;
        a=new int[10];
        System.out.print("Enter Numbers For Table :");
        for(i=0;i<10;i++){
            a[i]=ob.nextInt();
        }
        System.out.println("Enter Table Number : ");
        table = ob.nextInt();
        System.out.println("Table is ----");
        for(i=0;i<=10;i++){
            System.out.println(table*a[i]);
        }
    }
}