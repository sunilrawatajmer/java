public class PassArgumentbyArray {
    public static void main(String[] args) {
        fun("Sunil","Surendra","Suraj","Rakesh");
       fun("Renu","Ratha","Neha");
    }

    static void fun(String ...x){
        for(String i:x){
            System.out.println("Hello "+i);
        }
    }
}
