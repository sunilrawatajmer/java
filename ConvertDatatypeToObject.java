//Converting Basic Datatype to Respective Object


public class ConvertDatatypeToObject {
    public static void main(String[] args) {
        int i=10;

        Integer obj = new Integer(i);
        System.out.println(obj);

        Integer obj2 = Integer.valueOf(i);
        System.out.println(obj2);

        Integer obj3 = i;//AutoBoxing
        System.out.println(obj3);
    }
}
