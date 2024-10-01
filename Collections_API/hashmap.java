package Collections_API;
import java.util.*;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
public class hashmap {
    public static void main(String[] args) {
       HashMap<String, String> mpp = new HashMap<>();
       mpp.put("India","Delhi");
       mpp.put("US", "DC");
       mpp.put("UK", "London"); 

       // Iterator over key - keySet()

       Iterator<String> it = mpp.keySet().iterator();
       while(it.hasNext()){

        // For key

        String key = it.next();

        // for getting values

        String value = mpp.get(key);
        System.out.println("Key = "+ key + " ; "+ "Value = " +value);
       }

      System.out.println("------------");

       // Iterator over set ( Pair ) : using entrySet()

       Iterator <Entry<String,String>> it2 = mpp.entrySet().iterator();
       while(it2.hasNext()){
        Entry<String,String> entry = it2.next();
        System.out.println("Key = "+entry.getKey()+" ; "+"Value  = "+entry.getValue());
       }
        
       System.out.println("------------");

       // Using Java 8 for Each and Lambda
       mpp.forEach((k,v)->System.out.println("Key = "+ k + " ; "+"Value = "+ v));

    }
    

}
