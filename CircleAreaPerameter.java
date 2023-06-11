/***********************passing argument and method****************/

public class CircleAreaPerameter
{
    public static void main(String[] args) {
        Pass ob = new Pass ();
        ob.circle(3.14f, 5);
        ob.Area();
        ob.Perameter();
       
    }
}

class Pass{

    float pi ;
    int r;
    void circle(float x,int y){
        pi=x;
        r=y;
    }

    void Area(){
        float area = pi*r*r;
        System.out.println("Area of Circle = "+area);
    }

    void Perameter(){
        float per = 2*pi*r;
        System.out.println("Perameter of Circle = "+per);
    }

}