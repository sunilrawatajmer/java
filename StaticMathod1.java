/*  Static Method
static mathod can be called using class name only
static method can access only static variables

 */

class StaticMethod{
    static int a;
    int b;

    static void inc(){
        a++;
    }

    static void show (){
        System.out.println("a = "+a);
    }
}


public class StaticMathod1 {
    public static void main(String[] args) {
        StaticMethod.inc();
        StaticMethod.inc();

        StaticMethod.show();
    }
}
