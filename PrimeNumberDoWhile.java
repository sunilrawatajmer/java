import java.util.*;
class table{
    public static void main(String arr[]) {
        int a,x=0,i=1;
        Scanner ob = new Scanner(System.in);
        
        System.out.print("Enter Number ");
        a=ob.nextInt();

        do{
            if(a%i==0){
                x++;
            }
            i++;
        }while(i<=a);

        if(x==2){
            System.out.print("It is prime Number");
        }
        else
        System.out.print("It is Not Prime Number");
    }
}