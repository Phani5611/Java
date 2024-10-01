package Collections_API;

import java.util.*;

public class arrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(Arrays.asList("10","20"));
       Object arr1[]= arr.toArray();
      System.out.println(Arrays.toString(arr1)); 
       
     
    }
}
