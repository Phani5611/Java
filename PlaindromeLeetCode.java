public class PlaindromeLeetCode {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        String str1="";
        for(int i=str.length()-1;i>=0;i--){
         str1 = str1 + str.char(i);
        }
        if(str.equals(str1)){
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        isPlaindrome(a);
    }
}
