public class ThisKeyword1 {
    public static void main(String[] args) {
        MyDemo ob = new MyDemo(10, 20);
        ob.Add();
    }
}

class MyDemo{
    int num1;
    int num2;

    MyDemo(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }

    void Add(){
        System.out.println("Sum = "+(num1+num2));
    }
}
