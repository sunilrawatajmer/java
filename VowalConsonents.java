import java.util.*;
class Vowal{
    public static void main(String a[]){
        String st;
        char ch;
        Scanner ob = new Scanner(System.in);

        System.out.println("Enter String ");
        st = ob.next();
        ch = st.charAt(0);

        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println("It is Vowal");
        }
        else{
            System.out.println("It is Consonent");
        }
    }
}