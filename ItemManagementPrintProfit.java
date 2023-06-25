import java.util.Scanner;
class Item{
    public int code,purchasePrice,sellingPrice;
    String name;
     Scanner obj = new Scanner (System.in);
    void Set(){
        System.out.print("Enter Item Code : ");
        code=obj.nextInt();
        System.out.print("Enter Item Name : ");
        name=obj.next();
         System.out.print("Enter Item PurchasePrice  : ");
        purchasePrice=obj.nextInt();
        System.out.print("Enter Item sellingPrice  : ");
        sellingPrice=obj.nextInt();
        
    }
    
    
    void show(){
        System.out.println("Code = "+code+"  Name = "+name+ " PurchasePrice = "+purchasePrice+ " sellingPrice = "+sellingPrice);
        //System.out.printf("");
    }
    
    
}


public class ItemManagementPrintProfit

{
	public static void main(String[] args) {
	    int toatalSellingPrice = 0;
	    int toatalPurchasePrice = 0;
	    int TotalProfit = 0;
	     
	    Item ob[] = new Item[2];
	    for(int i=0; i<2; i++){
	        ob[i]=new Item();
	        ob[i].Set();
	       //int tSellingPrice = ob[i].sellingPrice;
	       //int tPurchasePrice = ob[i].purchasePrice;
	        
	       toatalSellingPrice = toatalSellingPrice + ob[i].sellingPrice;
	       toatalPurchasePrice = toatalPurchasePrice + ob[i].purchasePrice;
	        TotalProfit=toatalSellingPrice-toatalPurchasePrice;
	       
	    }
	    
	    for(int i=0; i<2; i++){
	        ob[i].show();
	    }
	    
	    System.out.println("toatalSellingPrice = "+toatalSellingPrice);
	    System.out.println("toatalPurchasePrice = "+toatalPurchasePrice);
	    System.out.println("TotalProfit = "+TotalProfit);
	}
}
