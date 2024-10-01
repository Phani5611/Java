package classAndObject;
class student{
    public void getName(){
        System.out.println("Hi,Im student!");
    }
    

}
public class classAndObject {
    public static int  getNumber(){
    
       return 1;
    }
    public static void main(String[] args) {
        student obj = new student();
        obj.getName();
    // classAndObject obj2 = new classAndObject();
    int n =getNumber();
    System.out.println(getNumber());

    }
}
