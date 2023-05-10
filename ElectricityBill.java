import java.util.*;
class Job{
    public static void main(String arr[]) {
        int u,b;
        Scanner ob = new Scanner(System.in);

        System.out.println("Enter Unit ");
        u=ob.nextInt();

        if(u>0 && u<=50){
            r=0;
            System.out.println(r);
        }

        else if(u>50 && u<=200){
            r=u*5;
            System.out.println(r);
        }

        if(u>200 && u<=500){
            r=u*8;
            System.out.println(r);
        }

        else{
            r=u*10;
            System.out.println(r);
        }
    }
}