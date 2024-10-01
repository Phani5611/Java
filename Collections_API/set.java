package Collections_API;
import java.util.*;
public class set {
    public static void main(String[] args) {
        Set <Integer> hash=new TreeSet<>();
        hash.add(10);
        hash.add(120);
        hash.add(2);
        hash.add(5);
        hash.add(2);
        hash.add(4);
     Iterator<Integer>values =  hash.iterator();
     while(values.hasNext()){
          System.out.println(values.next());

     }
    }
}
