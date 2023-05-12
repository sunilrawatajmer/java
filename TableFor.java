import java.util.*;
class table{
    public static void main(String arr[]) {
        int a=1,table;
        Scanner ob = new Scanner(System.in);
        
        System.out.print("Enter Table Number ");
        table=ob.nextInt();

        for(a=1;a<=10;a++){
            System.out.println(table+"x"+a+"="+table*a);
        }
    }
}