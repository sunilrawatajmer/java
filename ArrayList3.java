//ArrayList Properties

import java.util.ArrayList;
public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();

        //Arraylist is class and (arr) is Arraylist Object 
        //ArrayList Is Index Based Data Structure
        //We Can Store Deffrent Datatypes Values in ArrayList
        //We Can Store Duplicate Values in ArrayList
        //We Can Store null Values in ArrayList
        //ArrayList does not follow Sorting order

        arr.add(1);//index:0
        arr.add("Sunil");//index:1
        arr.add(3);//index:2
        arr.add(4.11);//index:3
        arr.add(null);//index:4
        arr.add('c');//index:5
        arr.add("sunil");//index:6
        arr.add(null);//index:7
        arr.add(6);//index:8
      
        // arr.remove(1);

        System.out.println(arr);
    }
}
