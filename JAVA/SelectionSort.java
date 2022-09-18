import java.util.*;
// SELECTION SORT 
class SelectionSort{
 static void printArray(int arr[]){
    System.out.println("The sorted Array elements are : ");
    for(int i=0;i<arr.length;i++){
System.out.print( arr[i]+" ");
    }
    
 }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array :");
            int n =sc.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter the element into the array :");
            for(int k=0;k<n;k++){
                arr[k]=sc.nextInt();
            }


   // Sorting Logic
            for(int i=0;i<n-1;i++){
                int smallest = i;
                for(int j=i+1;j<n;j++){
                    //  if the samllest element is greater than the j ( next element) then we make that "j" element as  the                    smallest element
                 if(arr[smallest]>arr[j]){
                 smallest=j;       
                }                
            }
                int temp = arr[smallest];
                arr[smallest]=arr[i];                  //Swap
               arr[i]=temp;

            }
            printArray(arr);
        }



    }
}