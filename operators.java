import java.util.Scanner;
class operators{
    public static void main(String arr[]) {


        //<<<<------ARITHMATIC OPERATOR------->>>>
        int l=2,e=10;
        int p=l+e;
        System.out.println("p="+p);
        int s=l-e;
        System.out.println("s="+s);

        

        //<<<<------CONDITIONAL OPERATOR------->>>>
        int a=11,b=22,c;
        c = a>b ? a : b ;
        System.out.println("c="+c);



        //<<<<------INCREMENT & DECREMENT OPERATOR------->>>>
        int x=11,y=22;
        x++ ;
        y++ ;
        System.out.println("x="+x);
        System.out.println("y="+y);



        //<<<<------Assignment OPRETOR------->>>>
        int m=11,n=22;
        m+=5;
        n-=10;
        System.out.println("m="+m);
        System.out.println("n="+n);



        //<<<<------RELATIONAL OPERATOR------->>>>
        System.out.println(5>2);
        System.out.println(1>8);



        //<<<<------LOGICAL OPERATOR------->>>>
        System.out.println(5>2&&2<6);//AND OPERATOR
        System.out.println(5>2&&2>6);
        System.out.println(1>8||5<8);//OR OPERATOR
        System.out.println(1>8||5>8);
        //LOGICAL NOT OPERATOR
        int u=11;
        boolean v = (a>4);
        System.out.println(v);
        v = !(a>4);
        System.out.println(v);

        }
}