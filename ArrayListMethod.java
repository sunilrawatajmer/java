/*
ArrayList Methods 
=========================================================================
1) Add()=Use to Add Elements{add(value),add(index,value)}
2) remove()=Use to Remove Elements {remove(indexnumber),,remove(value)}
3) get()=Use to Access Elements {get(index)}
4) set()=Use to Update,Change,Replace Element {set(index,value)}
5) clear()=Use to Clear All Elemets in ArrayList{clear()}
6) size()=Use to Find size {size(Arraylistname)}
7) addAll()=For add all Elements {addAll()}
8) clone()=make a copy of Arraylist{clone(arraylistname)}
9) contains()=Use to Check Element is Present in Arraylist Or Not{contains(value)}
10) removeAll()=For remove all Elements {removeAll()}
11) sort()=Sort Arraylist 
12) isEmplty() = for Check Arraylist Is Emply or Not
13) toArray()=Convert ArrayList to Array
14) tostring()=Convert ArrayList to string
15) replaceAll()=Replace All Elements of Arraylist
16) removeif()=Remove Elements if Condition is True
17) indexof()=use to find index value of any Element
=============================================================================
 */

import java.util.ArrayList;
public class ArrayListMethod {
    public static void main(String[] args) {
        ArrayList arr1 = new ArrayList();

        //Add MEthod = Use to Add Elements 
        arr1.add(11);
        arr1.add("Sunil");
        System.out.println(arr1);

        //Size Method = Use to Get Arraylist Size
       int s=arr1.size();
        System.out.println(s); 
    }
}