public class tryCatch {
    public static void main(String[] args) {
        int i,j;
        try{
            i=9;
            j=0;
          int k = i/j;
        }
        catch(Exception e){
           System.out.println("i and j are not divisible");
        }
    }
}
