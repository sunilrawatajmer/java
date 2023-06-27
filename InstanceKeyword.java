public class InstanceKeyword {
    public static void main(String[] args) {
        insta ob = new insta();
        ob.show();

        System.out.println(ob instanceof insta);

        boolean b = ob instanceof insta;
        System.out.println(b);
    }
}

class insta{
    int a;

    insta(){
        a=10;
    }

    void show (){
        System.out.println("a="+a);
    }
}
