package sortingAlgo;

public class bubble {
    private static void swap(int arr[],int i, int j){
        if(i>=0 && i<arr.length && j>=0 && j<arr.length){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        else{
            System.out.println("Unable to sort");
        }
        
    }
    private static int []secondOrder(int arr[],int n){
        for(int i=arr.length-1;i>=0;i--){
            for(int j=0;j<=i-1;j++){
               if(arr[j]>arr[j+1]){
                   swap(arr,j,j+1);
               }
            }
           }
           
           int secondMax=arr[arr.length-2];
           int secondMin=arr[1];
           int arr1[]={secondMax,secondMin};
           return arr1;
    }
    public static void main(String[] args) {
        int arr[]={4,3,2,1};
        int print[]=secondOrder(arr, 4);
        for(int x : print){
            System.out.println(x);
        }
       
    }
}
