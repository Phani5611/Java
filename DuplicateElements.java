import java.util.*;
public class DuplicateElements {
  static int  isDuplicate(int arr[]){
   HashSet<Integer> set = new HashSet<>();
   for(int i=0;i<arr.length;i++){
    set.add(arr[i]); 
}
int k = set.size();
int j =0;
for (int x : set){
    arr[j++] = x;
    //System.out.print(x);
}
return k;
}
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //isDuplicate(arr);
        for(int j=0;j<isDuplicate(arr);j++){
            System.out.print(arr[j]+" ");
        }

    }
}
