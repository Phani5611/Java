package Stack;
import java.util.Arrays;
import java.util.Stack;
public class NextSmallestElement {
        public int[] prevSmaller(int[] A) {
            int len = A.length;
            int nse[] = new int[len];
            Stack<Integer> st = new Stack<>();
            for(int i = 0;i<len;i++){
                while(!st.isEmpty() && st.peek()>=A[i]){
                    st.pop();
                }
                nse[i]=st.isEmpty()?-1:st.peek();
                st.push(A[i]);
                
            }
            return nse;
        }
    public static void main(String[] args) {
        int arr[]={4,5,2,10,8};
        NextSmallestElement obj = new NextSmallestElement();
        int result[]=obj.prevSmaller(arr);
       System.out.println(Arrays.toString(result));
        
        
    }
    
}
