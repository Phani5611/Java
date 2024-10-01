import java.util.*;
public class reverseAString{
    static void stringReverse(char[] S){
       for(int i=S.length-1;i>=0;i--)
       {
         System.out.print(S[i]);
       }
       
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str =sc.nextLine();
    char [] ch = new char[str.length()];
    for(int i=0;i<str.length();i++){
        ch[i]=str.charAt(i);
    }
    // System.out.print(ch);
    stringReverse(ch);

}
}