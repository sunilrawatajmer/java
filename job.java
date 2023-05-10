import java.util.*;
class Job{
    public static void main(String arr[]) {
        int age;
        Scanner ob = new Scanner(System.in);

        System.out.println("Enter Age ");
        age=ob.nextInt();

        if(age>=18 && age<=35){
            System.out.println("You Can Apply For Job");
        }
        else{
            System.out.println("You Can Not Apply For Job");

        }
    }
}