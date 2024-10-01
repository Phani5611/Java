package TCSNQTPrep;

public class SubArrayWithMaxSum {
    public static void main(String[] args) {
        int arr[]={5,4,1,7,8};
        int max_sum=0; 
        for(int i = 0 ;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum = sum+arr[j];  
                max_sum=Math.max(max_sum, sum);
            }
          
        }
        
        System.out.println(max_sum);
    }
}
