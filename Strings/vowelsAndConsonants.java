package Strings;
public class vowelsAndConsonants {
    public static int[] findVowelsAndConsonants(String str){
        int n = str.length(); int vcount = 0; int ccount=0;
        char arr[]=str.toCharArray();
        for(int i : arr ){
            if(i=='a' || i =='e' || i =='o' || i=='i' || i=='u'){
              vcount++;
            }
            else{
                ccount++;
            }
        }
        return new int[]{vcount,ccount};
    }
    public static void main(String[] args) {
    String str = "aeioubnm";
    int res[] = findVowelsAndConsonants(str);
    for(int i : res){
        System.out.println(i);
    }
    }
}
