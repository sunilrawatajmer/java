import java.util.*;
class table{
    public static void main(String arr[]) {
        int a=1,table;
        Scanner ob = new Scanner(System.in);
        
        System.out.println("Enter Table Number ");
        table=ob.nextInt();
        
        while(a<=10){
            System.out.println(table+"x"+a+"="+table*a);
            a++;
        }
    }
}