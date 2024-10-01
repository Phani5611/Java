package Collections_API;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class copyOnWriteArrayList {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
        empList.add("Java");
        empList.add("C++");
        empList.add("Javascriipt");
        Iterator <String> it = empList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
