package slidingWindow;
import java.util.*;
public class NumberOfSubstringsContainsAllThreeChars {
    public static int NumberOfSubstrings(String s){
        int n = s.length();
        int count=0;
        Map<Character,Integer> mpp = new HashMap<>();
        for(int i = 0 ; i<n ; i++){
            mpp.put('a', 0);
            mpp.put('b', 0);
            mpp.put('c', 0);
        for(int j = i ; j<n ;j++){
            mpp.put(s.charAt(j), mpp.get(s.charAt(j))+1);
            if(mpp.get('a')>0 && mpp.get('b')>0 && mpp.get('c')>0){

                //
                count+=n-j;
                break;
            }
        }
        }
        return count;
    }


    //Optimal Approach
    public static int NumberOfSubstrings2(String s){
        int n = s.length();
        int count=0; int left = 0; int right = 0;
        int min_window=-1;
        Map<Character,Integer> mpp = new HashMap<>();
            mpp.put('a', -1);
            mpp.put('b', -1);
            mpp.put('c', -1);
        for(int i = 0 ;i<n;i++){
            mpp.put(s.charAt(i),i);
          if(mpp.get('a')!=-1 && mpp.get('b')!=-1 && mpp.get('c')!=-1){

            // No of Sub strings containing the min window elements
            count = count +( 1+(Math.min(Math.min(mpp.get('a'), mpp.get('b')),mpp.get('c'))));

            // Minimum Window length 
            min_window = i - Math.min(Math.min(mpp.get('a'), mpp.get('b')),mpp.get('c'))+1;
          }
        }return min_window;
    }
    public static void main(String[] args) {
        String s = "abcabc";
        int res = NumberOfSubstrings2(s);
        System.out.println(res);

    }
}
