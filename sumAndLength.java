import java.util.Scanner;
// Given an Array  - Sum of all values in array and Mulitply the length of the array.
public class sumAndLength {
    public static int sumMultiplyLength(int arr[],int length){
        int sum = 0;
        for (int i : arr){
             sum+=i;
        }
       return length*sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array :");
        int length = sc.nextInt();
        int arr[] = new int[length];
         System.out.print("Enter the elements of the array :");
        for(int i=0;i<length;i++)
        {
            arr[i]=sc.nextInt();
        }
      System.out.println(sumMultiplyLength(arr, length));
    }
}
