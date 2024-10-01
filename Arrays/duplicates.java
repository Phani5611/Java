package Arrays;

public class duplicates {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,4,5};
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        for(int k =0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }

}
