package lambdaExpression;
@FunctionalInterface
interface A{
    void show(int a,int b );
    
}
public class lambdaExpression {
    public static void main(String[] args) {
        A obj = (a,b)->{
            System.out.println("In show " + a);
        };
        obj.show(5,6);
    }
}
