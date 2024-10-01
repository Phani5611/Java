import java.util.*;
public class arrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements into the array :");
        ArrayList <Integer> arr = new ArrayList<>();
        for(int i=0;i<=5;i++){
            arr.add(sc.nextInt());
        }
    System.out.print("The Elements are :");
    for (Integer j : arr) {
        System.out.print(j+" ");
        
    }
    }
}
