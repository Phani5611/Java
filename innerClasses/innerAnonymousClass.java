package innerClasses;
interface Computer{
     void code();
}
class Laptop implements Computer{
    public void code(){
        System.out.println("Code, Compile, Run in Laptop");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("Code, Compile, Run in Desktop");
    }
}
class Developer{
    public void devApp(Computer lap){
        lap.code();
    }
}
public class innerAnonymousClass {

     public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        
        Developer Phani = new Developer();
        Phani.devApp(desk);
     }
}