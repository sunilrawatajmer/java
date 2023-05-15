import java.util.*;
class cal{
    public static void main(String arr[]){
        int f,s,r;
        char ch;
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter 1st Number");
        f=ob.nextInt();
        
        System.out.print("Enter 2nd Number");
        s=ob.nextInt();

        System.out.println("Select Your Oprations");
        System.out.println("Press +  For Addition");
        System.out.println("Press -  For Subtriction");
        System.out.println("Press / For Dividation");
        System.out.println("Press %  For Modulation");

        System.out.print("Enter Choise");
        ch=ob.next().charAt(0);

        switch (ch) {
            case '+':
            r=f+s;
            System.out.print("Result =" + r);
            break;

            case '-':
            r=f-s;
            System.out.print("Result =" + r);
            break;

            case '/':
            r=f/s;
            System.out.print("Result =" + r);
            break;

            case '%':
            r=f%s;
            System.out.print("Result =" + r);
            break;
        
            default:
            System.out.print("Invalid choise");
             break;
        }
}
}