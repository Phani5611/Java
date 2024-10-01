package abstractKeyword;
abstract class A{
    public abstract void print(String name);
}
// class B extends A{
//     @Override
//     public void print(String name) {
//         System.out.println("This is concrete class " + name);
//     }
// }
public class abstarct {
    public static void main(String[] args) {
        A obj = new A(){
            public void print(String name) {
                System.out.println("This is concrete class " + name);
            }
        };
        obj.print("Phani");
    }
}
