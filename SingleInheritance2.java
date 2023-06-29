import java.util.Scanner;
class Parant{
    int a,b;
    void setAB(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enetr Two Numbers : ");
        a=obj.nextInt();
        b=obj.nextInt();
    }
    
    void showAB(){
        System.out.println("a = "+a+" b = "+b);
    }
}

class Child extends Parant{
    int sum;
    int sub;
    int multy;
    int mod;
    int rem;
    void add(){
        sum =a+b;
        System.out.println("Addition = "+sum);
    }
    void sub(){
        sub =a-b;
        System.out.println("Subtruction = "+sub);
    }
    void multy(){
        multy =a*b;
        System.out.println("Multiply = "+multy);
    }
    void mod(){
        mod =a%b;
        System.out.println("Modulation = "+mod);
    }
    void rem(){
        rem =a/b;
        System.out.println("Dividation = "+rem);
    }
}


class SingleInheritance2{
    public static void main(String arr[]){
        Child ob1 = new Child();
        ob1.setAB();
        ob1.showAB();
        System.out.println();
        ob1.add();
        ob1.sub();
        ob1.multy();
        ob1.mod();
        ob1.rem();
        
        
    }
}