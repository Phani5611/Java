package Arrays;
import java.util.*;
public class roatateelementsByDPlaces {
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        int n= arr.size();
        k=k%n;
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=0;i<k;i++){
           temp.add();
       }

       for(int i=k;i<n;i++){
              arr[i-k]=arr[i];
       }
       
       for(int i=n-k;i<n;i++){
       arr[i]=temp[i-(n-k)];
       }
}
