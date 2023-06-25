public class NestedConstructor {
    public static void main(String[] args) {
        Nested ob = new Nested(10, 20);
        ob.showData();
        /*OUTPUT
         a=0
         b=10
         */
    }
}

class Nested{
    int a,b;

    Nested(int x){
        b=x;
    }

    Nested (int x,int y){
        this(x);
       // this(y);
    }
     
    void showData(){
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
