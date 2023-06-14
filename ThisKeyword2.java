public class ThisKeyword2 {
    public static void main(String[] args) {
        Exa s1 = new Exa("Sunil", "Rawat");
        s1.showData();
    }
}

class Exa{
    String a,b;

    Exa(String a,String b){
        this.a=a;
        this.b=b;
    }

    void showData(){
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
