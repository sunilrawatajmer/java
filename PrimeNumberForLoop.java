import java.util.*;
class prime{
    public static void main(String arr[]) {
        int a,x=0,i=2;
        Scanner ob = new Scanner(System.in);
        
        System.out.print("Enter Number ");
        a=ob.nextInt();

        for(i=2;i<a;i++){
            if(a%i==0){
                x++;
            }
        }

        if(x!=0){
            System.out.print("It is not prime Number");
        }
        else{
        System.out.print("It is Prime Number");
    }
    }
}