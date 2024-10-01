package BitManipulation;

import java.util.Scanner;

public class convertToDecimal {
  private static  int convert2Decimal(String x){
        int len = x.length();
        int p2=1;
        int num=0;
        char strArr[]=x.toCharArray();
        for(int i = len-1;i>=0;i--){
            if(strArr[i]=='1'){
              num=num + p2;
            }
            p2=p2*2;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(convert2Decimal("1101"));
    }
}
