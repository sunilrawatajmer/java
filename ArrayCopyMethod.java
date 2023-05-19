import java.util.*;
public class ArrayCopyMethod{
public static void main(String x[]) {
    int a[]={2,3,4,5,6,7,8,9,10};
    int b[]=new int [10];

    System.arraycopy(a,0,b,0,6);

    for(int i:b)
    System.out.println(i);
}
}