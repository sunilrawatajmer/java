import java.util.*;
class ForEachLoop2 {
    public static void main(String s[]){
        int a[]={1,2,3,4,5};
        String st[]={"sunil","anil","rawat"};

        System.out.println("Integer Array Element - ");
        for(int i : a){
            System.out.println(i);
        }

        System.out.println("String Array Element - ");
        for(String k : st){
            System.out.println(k);
        }
    }
}
