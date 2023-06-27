public class ConvertStringToInteger {
    public static void main(String[] args) {
        String st = "10";
        
         int i = Integer.parseInt(st);
         System.out.println(i);

         String s = Integer.toString(i);
         System.out.println(s);

         System.out.println(s.getClass().getSimpleName());//String
         System.out.println(st.charAt(0));//1
    }
}
