import java.util.*;
class logical{
    public static void main(String a[]) {
         //<<<<------LOGICAL OPERATOR------->>>>
         System.out.println(5>2&&2<6);//AND OPERATOR
         System.out.println(5>2&&2>6);
         System.out.println(1>8||5<8);//OR OPERATOR
         System.out.println(1>8||5>8);
         //LOGICAL NOT OPERATOR
         int k=11;
         boolean v = (k>4);
         System.out.println(v);
         v = !(k>4);
         System.out.println(v);
    }
}