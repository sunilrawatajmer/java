import java.util.Scanner;
public class OperatorsCalculator {
    public static void main(String[] args) {
        Scanner ob = new Scanner (System.in);
        int choise;
        int choose;
        System.out.println("Enter First Number : ");
        int num1=ob.nextInt();
        System.out.println("Enter Second Number : ");
        int num2=ob.nextInt();
        do{

            System.out.println("Press 1 for Arithmetic Operator ");
            System.out.println("Press 2 for Assignment Operator ");
            System.out.println("Press 3 for Increment Operator ");
            System.out.println("Press 4 for Decrement Operator ");
            System.out.println("Press 5 for Logical Operator ");
            System.out.println("Press 6 for Relational Operator ");
            System.out.println("Press 0 to Exit ");

            System.out.print("Enter Your Choise : ");
            choise = ob.nextInt();

            switch(choise){

                case 1:
                System.out.println("Which operator You Want Use in Arithmetic Operator  - ");
                System.out.println("+,-,*,/,%");
                System.out.print("Choose : ");
                choose=ob.nextInt();
                switch(choose){
                    case '+':
                    int add=num1+num2;
                    System.out.print("Result = "+add);
                    break;

                    case '-':
                    int sub=num1-num2;
                    System.out.print("Result = "+sub);
                    break;

                    case '*':
                    int multy=num1*num2;
                    System.out.print("Result = "+multy);
                    break;

                    case '/':
                    int div=num1/num2;
                    System.out.print("Result = "+div);
                    break;

                    case '%':
                    int mod=num1%num2;
                    System.out.print("Result = "+mod);
                    break;

                }
                break;

                case 2:
                System.out.println("Which operator You Want Use in Assignment Operator  - ");
                System.out.println("+=,-=,*=,/=,=");
                System.out.print("Choose : ");
                choose=ob.nextInt();
                switch(choose){
                    case '+':
                    num1+=num2;
                    System.out.print("Result = "+num1);

                    case '-':
                    num1-=num2;
                    System.out.print("Result = "+num1);

                    case '*':
                    num1*=num2;
                    System.out.print("Result = "+num1);

                    case '/':
                    num1/=num2;
                    System.out.print("Result = "+num1);

                    case '%':
                    num1=num2;
                    System.out.print("Result = "+num1);

                }
                break;

            }

        }while(choise!=0);
}
}
