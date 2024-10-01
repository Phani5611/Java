import java.util.*;
public class reverseAStringSol2{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = "";
        //char[] ch = new char[str.length()];
      
        for(int i=str.length()-1;i>=0;i--){
            str1 = str1 + str.charAt(i) ;
        }
        System.out.print(str1);
    }
}