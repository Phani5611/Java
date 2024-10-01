package Arrays;
import java.util.*;;
public class AlternativeElementsBruteForce {
    private static int[] alternativeArray(int arr[]){ 
     int n = arr.length;
     ArrayList<Integer> pos= new ArrayList<>();
     ArrayList<Integer> neg= new ArrayList<>();
     for(int i =0 ;i<n;i++){
      if(arr[i]>0){
        pos.add(arr[i]);
      }
      else{
        neg.add(arr[i]);
      }
     }
    for(int i = 0; i< n/2 ;i++){
      arr[2*i] = pos.get(i);
      arr[(2*i)+1]=neg.get(i);
    }
    return arr;
    }
    public static void main(String[] args) {
        int arr[] ={1,4,-2,-5}; 
        int res[] = alternativeArray(arr);
        for (int i : res) {
            System.out.println(i);
        }
        
    }
}
