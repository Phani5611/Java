package Collections_API;
import java.util.*;
public class map {
    public static void main(String[] args) {
        HashMap<String,Integer> students = new HashMap<String,Integer>();
        students.put( "Phani", 26);
        students.put("Achu", 30);
        students.put("sai",40);
        System.out.println(students.get("Phani"));
    }
}
