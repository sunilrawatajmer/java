import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

public class MapMethod {
    public static void main(String[] args) {
        HashMap <Integer,String> map = new HashMap<Integer,String>();
        map.put(101, "Sunil");
        map.put(102, "Anil");
        map.put(103, "Suraj");
        map.put(102, "Rawat");
        //Agar Duplicate Key ho to Ve Purani Value Replace Karke New Value Store Ker dega

        System.out.println(map);

        System.out.println(map.containsKey(102));//true

        System.out.println(map.containsKey(105));//false

        System.out.println(map.containsValue("Sunil"));//true

        System.out.println(map.get(103));//Suraj

        map.replace(102,"Raja");//102=Raja

        System.out.println(map);

        System.out.println(map.hashCode());

        HashMap map2 = new HashMap<>();
        
        map2.putAll(map);
        System.out.println("New Map -- "+map2);
        System.out.println("------------");

        //entrySet Method = Change Map to Set
        Set set = map2.entrySet();

        Iterator itr = set.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("------------");

        //Uses For Each Loop

        for(HashMap.Entry i : map.entrySet()){
            System.out.println(i.getKey()+" -> "+i.getValue());
        }

        //compute method  = using for remapping
        map.compute(101,(k,V) ->  "renu" );
        System.out.println(map);

        //computeIfAbsent Method = for add new key 
        map.computeIfAbsent(105,(k)->"radha");
        System.out.println(map);

        //computeIfPresent Method = if Key Present Then Replace Value
        map.computeIfPresent(105,(K,V)->"sonu");
        System.out.println(map);
    
    }
}
