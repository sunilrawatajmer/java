/*
-----------TreeMAP Properties-----------

1) package  : java.util
2) TreeMAP Stores The Data in Key-Value pairs
3) For key Value we use Unique Value

 Exa.--         KEY     VALUE
               101     Sunil
               102     Anil
               103     Rawat
           
 4){Key Must Be Unique Also But Value Can be Duplicate }
 5) {key + value = its Called - Entry}
 6) TreeMAP Does Not Follow Insertion Order
 7) TreeMAP Follow Sorting Order According Key
 8) We can Insert Only One NULL value in Key But 
    In VAlue We Can INsert Multipal NULL Values


*/


import java.util.TreeMap;
public class TreeMapProperties{
    public static void main(String arr[]) {
        TreeMap<Integer,String> t1 = new TreeMap<Integer,String>();

        //////TreeMAP Follow Sorting Order According Key/////
        t1.put(105, "Sunil");
        t1.put(103, "Ratha");
        t1.put(107, "Renu");
        t1.put(109, "Suraj");
        t1.put(101, "Rani");

        System.out.println(t1);
        /*CellingEntry Method = if key is present then it is return key-value and 
        if key is not present then it is return next largest element AND Null*/
       System.out.println( t1.ceilingEntry(107));//107=Renu
       System.out.println( t1.ceilingEntry(108));//109=Suraj

       //CellingKey Method = its Return Only Key
       System.out.println( t1.ceilingKey(103));//103

        //containsKey Method = if key is present then return true else return false
       System.out.println( t1.containsKey(103));//true

        //containsKey Method = it is print first element of Map
        System.out.println( t1.firstEntry());//101=Rani

         //firstEntry Method = if key is present then print it Else Print its Minimum Element 
         System.out.println( t1.floorEntry(102));//101=Rani

         // get Method = Its Provide Value According Key it key not present then provide null
         System.out.println(t1.get(103));//Ratha

         //higherEntry Method = it is return keys Highest Element And When key not Present Then Return Null
         System.out.println(t1.higherEntry(103));

         //pollFirstEntry Method = its remove Map First Entry/Element
         System.out.println(t1.pollFirstEntry());

         //subMap Method = Ye key ke according Map Print Karayega (kaha se kaha tak equal key vala element print nahi krega )
        System.out.println( t1.subMap(101, 105));
    }
}

