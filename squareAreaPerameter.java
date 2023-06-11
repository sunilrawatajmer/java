/***********************passing argument and method****************/

public class squareAreaPerameter
{
    public static void main(String[] args) {
        Pass ob = new Pass ();
        ob.cal(3);
        ob.Area();
        Pass ob2 = new Pass ();
        ob2.cal(5);
        ob2.Perameter();


    }
}

class Pass{

    int a;
    void cal(int x){
        a=x;
    }
    void Area(){
        int area = a*a;
        System.out.println("Area Of Square = "+area);
    }

    void Perameter(){
        int per =4*a;
        System.out.println("Perameter Of Square = "+per);
    }

}