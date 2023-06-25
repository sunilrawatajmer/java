
import java.util.*;
class IceCreameManagementMiniProject
{
    public static void main(String arr[])
    {
        Scanner ob=new Scanner(System.in);
        int choice=0;
        ArrayList<Icecreemenegment>IceCream=new ArrayList<Icecreemenegment>();


        do{
            System.out.println("===================================");
            System.out.println("prees 0 to exit..");
            System.out.println("prees 1 to add ice creem..");
            System.out.println("prees 2 to show");
            System.out.println("prees 3 to Purchase");
            System.out.println("===================================");

            System.out.println("enter your choice..");
            choice=ob.nextInt();

            switch(choice)
            {
                case 1:
                System.out.println("Add Icecreem:");
                String Icecreemname;
                int price;
                System.out.println("Enter Icecreem Falever Name:");
                Icecreemname=ob.next();

                System.out.println("Enter Icecreem price:");
                price=ob.nextInt();

                IceCream.add(new Icecreemenegment(Icecreemname,price));
                 break;
                 case 2:
                 System.out.println("ALL Icecreem name-----");
                 System.out.println("Name \t Price");
                 for(Icecreemenegment Icecreemenegmentob : IceCream)
                 {
                    System.out.println(Icecreemenegmentob.Icecreemname+" \t"+Icecreemenegmentob.price);
                 }
                 break;  
                 case 3:
                 
                 System.out.print("haa jii kai chave = ");
                  String IcecreemName = ob.next();
                  for(Icecreemenegment i :IceCream ){
                    if(i.Icecreemname.equals(IcecreemName)){
                        System.out.println("........Ok Jii, Pay And Get IceCream");
                    }


                     String icePurchase;
                    do{
                        System.out.println();
                    System.out.println("Do You Want To Purchase More IceCream(yes/no)");
                     icePurchase=ob.next();

                     if(icePurchase.equals("yes")){
                  System.out.print("haa jii kai chave = ");
                   IcecreemName = ob.next();
                  for(Icecreemenegment c :IceCream ){
                    if(i.Icecreemname.equals(IcecreemName)){
                        System.out.println("......Ok Jii, Pay And Get IceCream");
                    }
                    }
                }

                else{
                    System.out.println(".........Ok,Thank You!");
                }
                  }while(! icePurchase.equals("no"));
                 break;
                 
            }
        }
    }while(choice!=0);
}
}
class Icecreemenegment
{
    String Icecreemname;
    int price;
    Icecreemenegment(String Icecreemname,int price){
        this.Icecreemname=Icecreemname;
        this.price=price;
    }
}