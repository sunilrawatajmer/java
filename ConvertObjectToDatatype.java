//Converting Object To Datatype//

public class ConvertObjectToDatatype {
    public static void main(String[] args) {
        int i=10;

        Integer obj = Integer.valueOf(i);
        System.out.println(obj);

        int j = obj.intValue();
        System.out.println(j);

        int k = obj;
        System.out.println(k);
    }
}
