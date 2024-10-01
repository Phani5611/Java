package slidingWindow;

public class LongestRepeatingCharacterReplacement {
    
   private static int findLongestRepeatingCharcterReplacement(String s , int k){
    int n = s.length();
    int max_len=0;
    for(int i = 0 ;i<n;i++){ 
        int B = 0;
    for(int j = i ;j<n;j++){
       
        if(s.charAt(j)=='B'){
            B++;
        }
        if(B<=k)
        {
            max_len = Math.max(max_len, j-i+1);
        }
        
    }
    }
     return max_len;
    }
    
    //Optimal Approach
    public static int characterReplacement(String s, int k) {
        int n = s.length();
        int left =0;
        int right=0;
        int max_len=0;
        while(right<n){
            int B=0;
            if(s.charAt(right)=='B')
            {
                B++;
            }
            if(B<=k){
               max_len = Math.max(max_len,right-left+1);
            }
            if(B>k){
                if(s.charAt(left)=='B'){
                       B--;
                }
                left++;
            } 
            right++;
           
            
        }
        return max_len;
    }
    
    public static void main(String[] args) {
        String str = "AABABBA";
        int len = characterReplacement(str,1);
        System.out.println(len);
    }
}
