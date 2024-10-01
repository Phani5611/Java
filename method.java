class pen{
    public String getPen(int cost){
        if( cost > 5){
             return "Pen";
        }
        return "Nothing";
        
    }
}
public class method {
    public static void main(String[] args) {
        pen obj = new pen();
       String Str = obj.getPen(10);
       System.out.println(Str);
    }
}
