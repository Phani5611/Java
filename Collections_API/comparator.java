package Collections_API;

import java.util.ArrayList;
import java.util.*;

public  class comparator {
    public static void main(String[] args) {
  Comparator<Integer> com =new Comparator<Integer>(){
    public int compare(Integer i,Integer j){
    if(i%10>j%10){
        return 1;
    }
    else{
        return -1;
       }
     
    }
    };
        List<String> list=new ArrayList<>();
        list.add("Phani");
        list.add("Sai");
        list.add("Srinivas");
        System.out.println(list.subList(0,2).size());
        // Collections.sort(list,com);
        // System.out.println(list);
    }
}
