public class PassingObject {
    public static void main(String[] args) {
        Obj ob1=new Obj();
        Obj ob2 = new Obj(10,20);

        ob1.fun(ob2);
        ob1.show();
        ob2.show();
    }
}

class Obj{
    int a,b;
    Obj(){
        a=0;
        b=0;
    }

    Obj(int x,int y){
        a=x;
        b=y;
    }
    void fun(Obj t){
        this.a=t.a;
        this.b=t.b;
    }

    void show(){
        System.out.println(a);
        System.out.println(b);
    }

}
