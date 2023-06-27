class Sum{
    static int a;

     void Set(int x){
        a=x;
    }

    void show(){
        int sum = a+a;
        System.out.println("Sum = "+sum);
    }
}


public class StaticVariableAndMethod {
    public static void main(String[] args) {
        Sum ob1 = new Sum();
        Sum ob2 = new Sum();
        
        ob1.Set(10);
        ob1.show();
        ob2.Set(20);

        ob1.show();
        ob2.show();
    }
}
