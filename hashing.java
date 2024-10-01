import java.util.*;
public class hashing {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int size = sc.nextInt();
        System.out.println("enter the no of queries");
        int q = sc.nextInt();
        System.out.println("Enter the elements into the array: ");
        int arr[]= new int[size];
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        while(q<0);
        System.out.println("Enter the numbers for query to fetch :");
        int number=sc.nextInt();
         //Pre compute
        int hash[]= new int[13];
        for(int i=0;i<size;i++){
            hash[arr[i]]+=1;
        } 
        System.out.println(hash[number]);
    }
}
