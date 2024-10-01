package BitManipulation;

import java.util.*;

public class convertToBinary {
   private static String convert2Binary(int n){
        StringBuilder res= new StringBuilder();
        while(n != 0){
        if(n%2==1){
            res.append('1');
        }
        else{
            res.append('0');
        }
            n=n/2;
        }
        res.reverse();
       String ans= res.toString();
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println(convert2Binary(13));
    }
}
