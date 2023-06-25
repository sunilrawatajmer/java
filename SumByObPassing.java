//Passing object and print Sum
public class SumByObPassing {
    public static void main(String[] args) {
        Sum ob1=new Sum();
         Sum ob2 = new Sum(10,10);

         ob1.TwoNumber(ob2);
        ob1.show();
        ob2.show();

        
    }
}

class Sum{
    int a;
    int b;
   int c=0;

    Sum(){
        a=0;
        b=0;
        c=a+b;
    }

    Sum(int x,int y){
        a=x;
        b=y;
        c=a+b;
    }

    void TwoNumber(Sum s){
        this.a=s.a;
        this.b=s.b;
        this.c=a+b;
    }

    void show(){
        System.out.println("Sum = "+c);
        
    }
}
