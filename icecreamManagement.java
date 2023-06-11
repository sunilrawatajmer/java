 /* 
 case 3:
                  {
                 System.out.println("sell Icecreem--------");
                 System.out.print("haa saman kai chave = ");
                  String IcecreemName = ob.next();

                  if(Icecreen.equals(IcecreemName))
                  {
                    System.out.println("yes");
                  }
                 break;
                 
            }
                 */






import java.util.*;
class icecreanManagement
{
    public static void main(String arr[])
    {
        Scanner ob=new Scanner(System.in);
        int choice=0;
        ArrayList<Icecreemenegment>Icecreen=new ArrayList<>();


        do{
            System.out.println("prees 0 to exit..");
            System.out.println("prees 1 to add ice creem..");
            System.out.println("prees 2 to show");
            System.out.println("prees 3 to sell");

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

                Icecreen.add(new Icecreemenegment(Icecreemname,price));
                 break;
                 case 2:
                 System.out.println("ALL Icecreem name-----");
                 System.out.println("Name \t Price");
                 for(Icecreemenegment Icecreemenegmentob : Icecreen)
                 {
                    System.out.println(Icecreemenegmentob.Icecreemname+" \t"+Icecreemenegmentob.price);
                 }
                 break;  
                  case 3:
                 {
                 System.out.println("sell Icecreem--------");
                 System.out.print("haa saman kai chave = ");
                  String IcecreemName = ob.next();


                  for(int j=0;j<Icecreen.size();j++){
                    Icecreemenegment x=Icecreen.get(j);
                    if(x.equals(IcecreemName)){
                        System.out.println("yes");
                    }
                  }

                
                 
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
    public boolean contains(String icecreemName2) {
        return false;
    }
}
