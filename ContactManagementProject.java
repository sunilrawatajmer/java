import java.util.ArrayList;
import java.util.Scanner;

class ContactManagementProject {
    public static void main (String a[]){
        int choise;
        ArrayList<Contact>AllContact=new ArrayList<Contact>();

        do{
            Scanner ob = new Scanner(System.in);

        System.out.println("=====================");
        System.out.println("Press 1 to Add New Contact ");
        System.out.println("Press 2 to Search a Contact ");
        System.out.println("Press 3 to View All Contact ");
        System.out.println("Press 4 to Delete a Contact ");
        System.out.println("Press 0 to Exit ");
        System.out.println("=====================");

        System.out.print("Enter Your Choise : ");
        choise=ob.nextInt();

        switch(choise){
            case 1:
            System.out.print("Enter 10 Digit Phone Number : ");
            Long PhoneNumber=ob.nextLong();
            System.out.print("Enter Name : ");
            String Name=ob.next();
            AllContact.add(new Contact(PhoneNumber, Name));
            break;

            case 2:
            System.out.println("For Search a Contact - ");
            System.out.println("Enter Name");
            String SearchName=ob.next();
            System.out.println("Name \t PhoneNumber");
            for(int i=0;i<AllContact.size();i++){
                if(SearchName == AllContact.get(i).Name);
                {
                    System.out.println(AllContact.get(i).Name+"\t"+AllContact.get(i).PhoneNumber);
                }
            }
            break;

            case 3:
            System.out.println("All Contact List - ");
            System.out.println("Name \t PhoneNumber");
            for(int i=0;i<AllContact.size();i++){
                System.out.println(AllContact.get(i).Name +"\t\t"+ AllContact.get(i).PhoneNumber);
            }
            break;

            case 4:
            System.out.println("For Detete a Contact - ");
            System.out.println("Enter Name");
            String DeleteName=ob.next();
            for(int i=0;i<AllContact.size();i++){
                if(DeleteName == AllContact.get(i).Name);
                {
                    AllContact.remove(i);
                }
            }
            break;


            default:
            break;
        }
        }while(choise!=0);
    }
}

class Contact{
   public long PhoneNumber;
   public String Name;
   public Contact(long PhoneNumber,String Name){
    this.PhoneNumber=PhoneNumber;
    this.Name=Name;
   }
}

