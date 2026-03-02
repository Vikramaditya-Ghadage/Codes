package Interview.Interview_Code_Debug;
import java.util.*;

public class CodeDebug {
    public static void concurrModificationException()
    {
        List<Integer> list = new ArrayList<>(List.of(1,2,3));
        for (Integer i : list) {  // we can use itrator
            list.remove(i);
        }
    }
    public static void mapWithImmutablity()
    {
        Map<StringBuffer, String> map = new HashMap<>();  
        StringBuffer key = new StringBuffer("key");
        map.put(key, "value");

        key.append("1");
        System.out.println(map.get(key));   // prints "value" beacuse 
        // StringBuilder or StringBuffer  does NOT override hashCode() or equals()
        // that why it store reference
        // only primitive types like integer,string,double have these logic is there


        Map<String, String> map2 = new HashMap<>();
        String newKey = "key";
        map2.put(newKey, "value");

        newKey = newKey + "1";
        System.out.println(map2.get(newKey)); // null


        Map<Integer, String> map3 = new HashMap<>();
        Integer k1 = 10;
        map3.put(k1, "value");

        k1++;
        System.out.println(map3.get(k1)); // null

    }

    public static void main(String[] args) {

        mapWithImmutablity();

       // concurrModificationException();
    }
}
