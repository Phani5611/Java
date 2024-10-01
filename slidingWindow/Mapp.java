package slidingWindow;

import java.util.HashMap;
import java.util.Map;
public class Mapp {

    public static void main(String[] args) {
        Map<Character,Integer> mpp = new HashMap<>(26);
        String s = "AABABBA";
        int k=2;
        int max_len=0;
        int most_freq=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                Map<Character, Integer> freqMap = new HashMap<>();
                    char rightChar = s.charAt(j);
                    freqMap.put(rightChar, freqMap.getOrDefault(rightChar, 0) + 1);
                    most_freq = Math.max(most_freq, freqMap.get(rightChar));
                    int changes = (j-i+1)-most_freq;
                if(changes<=k){
                    max_len=Math.max(max_len,(j-i+1));
                }
                else{
                    break;
                }
        }
}
System.out.println(max_len);
}
}
