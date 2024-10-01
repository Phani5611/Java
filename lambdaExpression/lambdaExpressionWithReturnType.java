package lambdaExpression;
@FunctionalInterface
interface A{
    int add(int i, int j);
}
public class lambdaExpressionWithReturnType {
    public static void main(String[] args) {
     A obj = ( i,  j)->{
         return i+j;
        };
    int res = obj.add(1, 2);
    System.out.println(res);

    }
}
