import java.util.ArrayList;
import java.util.Scanner;
public class BankManagement {
    public static void main(String[] args) {
        int choise, account=0;
        ArrayList<Bank>BankManagement=new ArrayList<Bank>();
        do{
            Scanner ob = new Scanner(System.in);

            System.out.println("----------------------------------------");
            System.out.println("Press 1 to Add Customer and Account");
            System.out.println("Press 2 to View Customer List");
            System.out.println("Press 3 to View Balance");
            System.out.println("Press 4 to Withdraw Ammount");
            System.out.println("Press 5 to Deposit Ammount");
            System.out.println("Press 6 to Remove Customer ");
            System.out.println("Press 0 to Exit");
            System.out.println("----------------------------------------");

            System.out.print("Enter Your Choise : ");
             choise = ob.nextInt();

             switch(choise){

                case 1:
                System.out.print("Enter FirstName : ");
                String firstName = ob.next();
                System.out.print("Enter LastName : ");
                String lastName = ob.next();
                System.out.print("Enter Address : ");
                String address = ob.next();
                System.out.print("Enter Mobile : ");
                int mobile = ob.nextInt();
                System.out.print("Enter Birth Year :");
                int Year = ob.nextInt();
                System.out.print("Enter Currect Balance : ");
                int balance = ob.nextInt();
                System.out.println("-------Customer is Added SuccessFully-------");
                account++;

                BankManagement.add(new Bank(firstName,lastName,address,mobile,Year,account,balance));
                break;


                case 2:
                System.out.println("------All Customer List -------  ");
                System.out.println("FirstName \t LastName \t Address \t Mobile \t Year \t Account \t Balance ");
                for(int i=0;i<BankManagement.size();i++){
                    System.out.println(BankManagement.get(i).firstName+"\t\t"+BankManagement.get(i).lastName+"\t\t"+BankManagement.get(i).address
                    +"\t\t"+BankManagement.get(i).mobile+"\t"+BankManagement.get(i).Year+"\t"+BankManagement.get(i).account+"\t\t"+BankManagement.get(i).balance);
                }
                break;


                case 3:
                System.out.print("Enter Account No.");
                int findBalance = ob.nextInt();
                for(int j=0;j<BankManagement.size();j++){
                    if(findBalance == BankManagement.get(j).account){
                        System.out.println("Currect Balance is :  "+BankManagement.get(j).balance);
                        break;
                    }
                }
                break;


                case 4:
                System.out.print("Enter Account Number : ");
                int AcNumber = ob.nextInt();
                for(int i=0;i<BankManagement.size();i++){
                    if(AcNumber == BankManagement.get(i).account){
                        System.out.print("Enter Ammount For Withdraw : ");
                       int WithdrawAmmount = ob.nextInt();
                       BankManagement.get(i).balance=BankManagement.get(i).balance - WithdrawAmmount;
                       System.out.println("Dear Customer, Rs."+WithdrawAmmount+" Withdraw to Your Account");
                    }
                }
                break;


                case 5:
                System.out.print("Enter Account No.");
                int accountNumber = ob.nextInt();
                for(int j=0;j<BankManagement.size();j++){
                    if(accountNumber == BankManagement.get(j).account){
                        System.out.print("Enter Ammount For Deposit : ");
                        int depositAmmount=ob.nextInt();
                        BankManagement.get(j).balance=BankManagement.get(j).balance+depositAmmount;
                        System.out.println("Dear Customer, Rs."+depositAmmount+" Debited to Your Account");
                        break;
                    }
                }
                break;


                case 6:
               System.out.println("-----------For Remove Customer--------");
               System.out.print("Enter Acccount Number : ");
               int removeCustomer=ob.nextInt();
                for(int i=0;i<BankManagement.size();i++){
                    if(removeCustomer==BankManagement.get(i).account){
                        BankManagement.remove(i);
                        System.out.println("Customer is Removed Sussecefully! : ");
                    }
                }
                break;
                
             }



        }while(choise!=0);
    }

}


class  Bank{
    String firstName;
    String lastName;
    String address;
    Integer mobile;
    Integer Year;
    Integer account;
    Integer balance;

    public Bank(String firstName, String lastName, String address, int mobile, int Year, int account,
            int balance) 
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.Year=Year;
        this.account=account;
        this.mobile=mobile;
        this.balance=balance;
    }
}