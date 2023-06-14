public class ItemManagement {
    public static void main(String[] args) {
        Item ob1 = new Item();
        ob1.setitemCode(101);
        ob1.setitemName("Fan");
        ob1.setpurchasePrice(120.00f);
        ob1.setsellingPrice(130.23f);
        ob1.setgst(0.12f);
        ob1.showData();

        System.out.println();

         Item ob2 = new Item();
        ob2.setitemCode(102);
        ob2.setitemName("coolar");
        ob2.setpurchasePrice(150.00f);
        ob2.setsellingPrice(160.23f);
        ob2.setgst(18.0f);
        
        
        System.out.println(ob2.getitemCode());
        System.out.println(ob2.getitemName());
        System.out.println(ob2.getpurchacePrice());
        System.out.println(ob2.getsellingPrice());
        System.out.println(ob2.getgst());
        System.out.println(ob2.getsellingPriceAfterTax());


        System.out.println();

        Item ob3 = new Item();
        ob3.setData(103, "Frize", 250.2f, 300, 25.11f);
        ob3.showData();
        
    }
}

class Item{
    int itemCode;
    String itemName;
    float purchacePrice;
    float sellingPrice;
    float gst;
    float total;

    void setData(int a,String b,float c,float d,float e){
         itemCode=a;
         itemName=b;
         purchacePrice=c;
         sellingPrice=d;
         gst=e;
          
     }
     
     void showData(){

        System.out.println("itemCode = "+itemCode);
        System.out.println("itemName = "+itemName);
        System.out.println("purchacePrice = "+purchacePrice);
        System.out.println("sellingPrice = "+sellingPrice);
        System.out.println("gst = "+gst);
        System.out.println("Total Price = "+total);
        
        
     }

     void setitemCode(int a){
        itemCode=a;
     }
     int getitemCode(){
        return itemCode;
     }

     void setitemName(String b){
        itemName=b;
     }
     String getitemName(){
        return itemName;
     }

     void setpurchasePrice(float c){
        purchacePrice=c;
     }
     float getpurchacePrice(){
        return purchacePrice;
     }

     void setsellingPrice(float d){
        sellingPrice=d;
     }
     float getsellingPrice(){
        return sellingPrice;
     }

     void setgst(float d){
        gst = d;
     }
     float getgst(){
        return gst;
     }

     float getsellingPriceAfterTax(){
        total = ((gst/100.0f)*sellingPrice)+sellingPrice;
        return total;
     }
    
}
