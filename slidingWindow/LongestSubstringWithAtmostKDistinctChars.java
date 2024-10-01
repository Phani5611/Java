package slidingWindow;

import java.util.*;

public class LongestSubstringWithAtmostKDistinctChars {

    //Brute Force;
    private static int bruteForce(String s, int k){
        int n = s.length();
        int count = 0;
        Map<Character, Integer> mpp = new HashMap<>();
        for(int i = 0 ; i< n ; i++){
            for(int j = i; j<n ;j++){
                mpp.put(s.charAt(j),mpp.getOrDefault((j),0)+1);
                if(mpp.size()<=k){
                    count = Math.max(count,j-i+1);
                }
                else{
                mpp.clear();
                break;
            }
                
            }
        }
        return count;
    }

    //Optimal
    private static int  optimalApproach(String s , int k){
        int n = s.length();
        int left = 0; int right = 0;
        int max_len = 0;
        Map<Character,Integer> mpp = new HashMap<>();
        while(right<n){
            mpp.put(s.charAt(right),mpp.getOrDefault(right,0)+1);
           
            if(mpp.size()<=k){
                max_len = Math.max(right-left+1, max_len);
            }
            if(mpp.size()>k){
                    mpp.put(s.charAt(left), mpp.get(left)-1);
                    if(mpp.get(left)==0)mpp.remove(left);
                    left++;
                } 
            }
            right++; 
         return max_len;
    }
     public static void main(String[] args) {
        String s = "abccd";
        int res = optimalApproach(s, 2);
        System.out.println(res);
     }
}