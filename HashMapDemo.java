import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class HashMapDemo{
    public static void main(String[] args) {

        //HashMap -  No gurantee in maintiaing the order
        //It is not synchronized
        // We can have null key & values in HashMap.

        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(1, "one");
        hm.put(2, "two");
        hm.put(3, "three");
        hm.put(4, "four");
        hm.put(5, "five");
        hm.put(null, "one");
        hm.put(null, null);

        System.out.println(hm);
        hm.remove(1);
        System.out.println("===================");
        System.out.println(hm);
        System.out.println("===================");


        // TreeMap provides ordering in natural sorting.
        // // It is not synchronized

        TreeMap<String, String> tm = new TreeMap<String, String>();

        tm.put("R", "red");
        tm.put("B", null);
        tm.put("G", "green");

        System.out.println(tm);

        // HashTable -  No gurantee in maintiaing the order
        // It is synchronized
        // It could not have null key and value.

        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

        ht.put(1, "one");
        ht.put(2, "two");
        ht.put(3, "three");
        ht.put(4, "four");
        ht.put(5, "five");
        // ht.put(null, "one");
        ht.put(6, "null");

        System.out.println(ht);
    }
}