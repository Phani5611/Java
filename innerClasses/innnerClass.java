package innerClasses;
class A{
   int n;
    public void show1(){
        System.out.println("In A Super Class ");
    }
     class B{
        public void show(){
            System.out.println("In B show inner inner Class");
        }
    }
}
public class innnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show1();
        //A.B Obj1 = new A.B();  //-> if class B then we write directly else 
        A.B obj1 = obj.new B();
        obj1.show();
    }
}
