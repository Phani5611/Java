package Strings;

public class largestOddNumber {
    public static void largestOddNumber(String s){

        // for(int i = s.length()-1 ; i>=0;i--)
        {
            char c = s.charAt(0);
            System.out.println(c%2);
        }
    }
    public static void main(String[] args) {
        String str = "52";
        largestOddNumber(str);
    }
}
