import java.util.Scanner;
import java.util.ArrayList;

public class ProductManagementMiniProject {
    public static void main(String[] args) {
        int choise;
        Scanner ob = new Scanner(System.in);
        ArrayList<product> ProductManagement = new ArrayList<>();
        do {

            System.out.println("=================================");
            System.out.println("Press 1 to Add Product ");
            System.out.println("Press 2 to Show Products List ");
            System.out.println("Press 3 to Purchase Product ");
            System.out.println("Pess 4 to Remove Product ");
            System.out.println("Press 0 to exit  ");
            System.out.println("=================================");

            System.out.print("Select An Option : ");
            choise = ob.nextInt();

            switch (choise) {
                case 1:
                    System.out.print("Enter Product Name : ");
                    String productName = ob.next();

                    System.out.print("Enter Product Code : ");
                    int productCode = ob.nextInt();

                    System.out.print("Enter Product Price : ");
                    Float productPrice = ob.nextFloat();

                    System.out.print("Enter Product Company Name : ");
                    String productcmpnyName = ob.next();

                    ProductManagement.add(new product(productName, productCode, productPrice, productcmpnyName));
                    break;

                case 2:
                    System.out.println("List Of Products ------");
                    System.out.println("Name \t\t Code \t\t Price \t\t Company");
                    for (int i = 0; i < ProductManagement.size(); i++) {
                        System.out.println(ProductManagement.get(i).productName + "\t\t"
                                + ProductManagement.get(i).productCode + "\t\t"
                                + ProductManagement.get(i).productPrice + "\t\t"
                                + ProductManagement.get(i).productcmpnyName);
                    }
                    break;

                case 3:
                    System.out.print("What you Want to Purchase : ");
                    String purchaseProduct = ob.next();
                    for (product c : ProductManagement) {
                        if (c.productName.equals(purchaseProduct)) {
                            System.out.println("..............Ok Sir,Pay and Get Your Product");

                            System.out.println();

                        }
                    }

                    String morePurchase;
                    do {
                        System.out.print(".....Do You Want to Purchase More Products (yes/no) : ");
                        morePurchase = ob.next();
                        if (morePurchase.equals("yes")) {

                            System.out.print("What you Want to Purchase : ");
                            purchaseProduct = ob.next();
                            for (product c : ProductManagement) {
                                if (c.productName.equals(purchaseProduct)) {
                                    System.out.println("..............Ok Sir,Pay and Get Your Product");

                                    System.out.println();

                                }
                            }
                        }

                        else{
                            System.out.println("Ok Sir,Thank You!");
                        }
                    } while (!morePurchase.equals("no"));
                    break;

                case 4:
                    System.out.println("Enter Product Code : ");
                    int removeCode = ob.nextInt();

                    for (int j = 0; j < ProductManagement.size(); j++) {
                        if (removeCode == ProductManagement.get(j).productCode) {
                            ProductManagement.remove(j);
                        }
                    }
                    break;
            }
        } while (choise != 0);
    }
}

class product {
    String productName;
    int productCode;
    Float productPrice;
    String productcmpnyName;

    public product(String productName, int productCode, Float productPrice, String productcmpnyName) {
        this.productName = productName;
        this.productCode = productCode;
        this.productPrice = productPrice;
        this.productcmpnyName = productcmpnyName;

    }

}
