package TCSNQTPrep;

public class checkIfArrayIsSortedOrNot {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3,4};
        for(int i = 1 ;i<arr.length;i++){
                if(arr[i]>=arr[i-1]){
                    
                }
                else{
                    System.out.println(false);
                    break;
                }
            }
        
    }

}
