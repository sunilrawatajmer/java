import java.util.ArrayList;
import java.util.Scanner;

public class VegetableManagement {
    public static void main(String[] args) {
        int choise;
        Scanner ob = new Scanner(System.in);
        ArrayList<Vegetable> VegetableManagement = new ArrayList<>();

        do {

            System.out.println("======================================");
            System.out.println("Press 1 to Add VageTables ");
            System.out.println("Press 2 to View VageTables ");
            System.out.println("Press 3 to Purchase VageTables ");
            System.out.println("Press 0 to Exit ");
            System.out.println("======================================");

            System.out.println("Select an Option : ");
            choise = ob.nextInt();

            switch (choise) {

                case 1:
                    System.out.print("Enter VageTable Name : ");
                    String vageTableName = ob.next();
                    System.out.print("How Much Vagetable Is Avalable(kg) : ");
                    int avalable = ob.nextInt();
                    System.out.print("Enter VageTable Rate(Per/Kg) : ");
                    float rate = ob.nextFloat();
                    VegetableManagement.add(new Vegetable(vageTableName, avalable, rate));
                    break;

                case 2:
                    System.out.println("---------All VageTable List----------");
                    System.out.println("Name \t Kg \t Rate");
                    for (Vegetable v : VegetableManagement) {
                        System.out.println(v.vageTableName + "\t" + v.avalable + "\t" + v.rate);
                    }
                    break;

                case 3:
                    System.out.print("Which Vagetable You Want to Purchase  :");
                    String vagetablePurchase = ob.next();

                    for (Vegetable c : VegetableManagement) {
                        if (c.vageTableName.equals(vagetablePurchase)) {
                            System.out.print("How Much You Want to Purchase(Kg) : ");
                            int howMuch = ob.nextInt();
                            float currectPayment = howMuch * c.rate;
                            System.out.println(
                                    ".............Okk jii Pay " + currectPayment + " Rupay And Get Your VageTable.");
                        }

                        else if (!c.vageTableName.equals(vagetablePurchase)) {
                            System.out.println("...........Sorry, This Vagetable is Not Avalable");
                        }

                        String morePurchase;
                        do {
                            System.out.println("Do you Want to Purchase More VageTables(yes/no) ");
                            morePurchase = ob.next();

                            if (morePurchase.equals("yes")) {
                                System.out.print("Which Vagetable You Want to Purchase  :");
                                vagetablePurchase = ob.next();

                                for (Vegetable j : VegetableManagement) {
                                    if (j.vageTableName.equals(vagetablePurchase)) {
                                        System.out.print("How Much You Want to Purchase(Kg) : ");
                                        int howMuch = ob.nextInt();
                                        float currectPayment = howMuch * j.rate;
                                        System.out.println(
                                                "..................Okk jii Pay " + currectPayment
                                                        + " Rupay And Get Your VageTable.");
                                    }

                                    else if (!j.vageTableName.equals(vagetablePurchase)) {
                                        System.out.println("...........Sorry, This Vagetable is Not Avalable");
                                    }

                                }
                            }

                            else {
                                System.out.println(".........Okk jii ,Thank You!");
                            }
                        } while (!morePurchase.equals("no"));

                        break;

                    }

            }
        } while (choise != 0);
    }
}

class Vegetable {
    String vageTableName;
    int avalable;
    float rate;

    public Vegetable(String vageTableName, int avalable, float rate) {
        this.vageTableName = vageTableName;
        this.avalable = avalable;
        this.rate = rate;
    }
}
