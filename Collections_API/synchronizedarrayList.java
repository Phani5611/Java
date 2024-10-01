package Collections_API;
import java.util.*;
public class synchronizedarrayList {
    public static void main(String[] args) {
        List<String> namesList =Collections.synchronizedList(new ArrayList<>());
        namesList.add("Java");
        namesList.add("Python");
        namesList.add("C++");

        // Synchronized Block for Array List ( Thread Safe )
        synchronized(namesList){
          Iterator<String> it = namesList.iterator();
          while (it.hasNext()) {
            System.out.println(it.next());
          }
        }
    }
}
