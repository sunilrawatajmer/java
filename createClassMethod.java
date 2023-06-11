/***********************passing argument and method****************/

public class createClassMethod
{
    public static void main(String[] args) {
        Pass ob = new Pass ();
        ob.cal(3, 5);
        ob.Area();
        Pass ob2 = new Pass ();
        ob2.cal(2, 2);
        ob2.Perameter();


    }
}

class Pass{

    int a,b;
    void cal(int x,int y){
        a=x;
        b=y;
    }
    void Area(){
        int area = a*b;
        System.out.println("Area Of Rectangle = "+area);
    }

    void Perameter(){
        int per =2*(a+b);
        System.out.println("Perameter Of Rectangle = "+per);
    }

}