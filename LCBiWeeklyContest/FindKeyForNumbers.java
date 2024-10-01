package LCBiWeeklyContest;
class Solution {
    public String getMinDigitForKey(int num){
        String numStr=Integer.toString(num);
        int digits[]=new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        int min =digits[0];
       for(int i=0; i<digits.length;i++){
           if(digits[i]<min){
            min=digits[i];
           }
        }
        
        return Integer.toString(min);
    }
}
    // public int generateKey(int num1, int num2, int num3) {
        
    // }
public class FindKeyForNumbers {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String min = sol.getMinDigitForKey(356);
        System.out.println(min);
    }
}
