import java.util.Scanner;
public class ReturnTableNumber {
    public static void main(String[] args) {
        int num=0;
        int r=Table(num);
        for(int i=1;i<=10;i++){
            System.out.println(r+"x"+i+"="+r*i);
        }
    }

    static int Table(int x){
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter Table Number : ");
         x = ob.nextInt();
        return x;
        
        
    }
}