package Arrays;
import java.util.*;
import Collections_API.set;;
public class union {
    private static List<Integer> union(int a[], int b[]){
      Set<Integer> temp = new HashSet<>();
      for(int i = 0;i<a.length;i++){
        temp.add(a[i]);
      }
      for(int i=0;i<b.length;i++){
        temp.add(b[i]);
      }
      List<Integer> arr = new ArrayList<>();
      for(int i : temp){
        arr.add(i);
      }
      return  arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]={1,1,2,4};
        int b[]={2,3,1};
       List<Integer> temp=union(a, b);
       for(int i : temp){
        System.out.println(i);
       }
    }
}
