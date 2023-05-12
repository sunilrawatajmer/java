import java.util.*;
class table{
    public static void main(String arr[]) {
        int a,x=0,i=2;
        Scanner ob = new Scanner(System.in);
        
        System.out.print("Enter Number ");
        a=ob.nextInt();

        while(i<a){

            if(a%i==0){
                x++;
            }
            i++;
        }

        if(x==0){
            System.out.print("It is prime Number");
        }
        else
        System.out.print("It is Not Prime Number");
    }
}