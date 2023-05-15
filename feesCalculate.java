import java.util.*;
class Fees{
    public static void main(String arr[]){
        int f,s,r;
        char ch;
        Scanner ob = new Scanner(System.in);

        System.out.println("select your class");
        System.out.println("1(fees=100)");
        System.out.println("2(fees=200)");
        System.out.println("3(fees=300)");
        System.out.println("4(fees=400)");
        System.out.println("5(fees=500)");
        System.out.println("6(fees=600)");
        System.out.println("7(fees=700)");
        System.out.println("8(fees=800)");
        System.out.println("9(fees=900)");
        System.out.println("10(fees=1000)");
        System.out.println("11(fees=1100)");
        System.out.println("12(fees=1200)");

        System.out.print("Enter your class");
        f=ob.nextInt();
        

        switch (f) {
            case 1:
            System.out.print("Enter month ");
            s=ob.nextInt();
            r=s*100;
            System.out.print("Total Fees =" + r);
            break;

            case 2:
            System.out.print("Enter month ");
            s=ob.nextInt();
            r=s*200;
            System.out.print("Total Fees =" + r);
            break;

            case 3:
            System.out.print("Enter month ");
            s=ob.nextInt();
            r=s*300;
            System.out.print("Total Fees =" + r);
            break;

            case 4:
            System.out.print("Enter month ");
            s=ob.nextInt();
            r=s*400;
            System.out.print("Total Fees =" + r);
            break;

            case 5:
            System.out.print("Enter month ");
            s=ob.nextInt();
            r=s*500;
            System.out.print("Total Fees =" + r);
            break;

            case 6:
            System.out.print("Enter month ");
            s=ob.nextInt();
            r=s*600;
            System.out.print("Total Fees =" + r);
            break;

            case 7:
            System.out.print("Enter month ");
            s=ob.nextInt();
            r=s*700;
            System.out.print("Total Fees =" + r);
            break;

            case 8:
            System.out.print("Enter month ");
            s=ob.nextInt();
            r=s*800;
            System.out.print("Total Fees =" + r);
            break;

            case 9:
            System.out.print("Enter month ");
            s=ob.nextInt();
            r=s*900;
            System.out.print("Total Fees =" + r);
            break;

            case 10:
            System.out.print("Enter month ");
            s=ob.nextInt();
            r=s*1000;
            System.out.print("Total Fees =" + r);
            break;

            case 11:
            System.out.print("Enter month ");
            s=ob.nextInt();
            r=s*1100;
            System.out.print("Total Fees =" + r);
            break;

            case 12:
            System.out.print("Enter month ");
            s=ob.nextInt();
            r=s*1200;
            System.out.print("Total Fees =" + r);
            break;
        
            default:
            System.out.print("Invalid choise");
             break;
        }
}
}