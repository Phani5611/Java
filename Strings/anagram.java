package Strings;

import java.util.Arrays;

public class anagram {
    public static String stringSort(String str){
        char s1[]=str.toCharArray();
        Arrays.sort(s1);
        // String newStr = s1.toString();
        // return newStr;
       return new String(s1);
    }
   
    public static void isAnagram(String s, String t) {
   // if(s.length()!=t.length())return false;
    s = stringSort(s);
    t = stringSort(t);
    System.out.println(s);
    System.out.println(t);

//    for (int i = 0; i < s.length(); i++)
//     {
//       if (s.charAt(i) != t.charAt(i))
//         return false;
//     }
//     return true;
  }
    public static void main(String[] args) {
        String Str1 = "anagram";
        String Str2 = "nagaram";
        isAnagram(Str1, Str2);
    }
}
