package Constructors;

// Constructors - Constructor name should be = classname;
// Everytime when object is created costructor  is called;
class Human{
    private String name;
    private int age;
    
    public Human(){
       name="Phani";
       age=20;
    //  System.out.println("Name : "+name +";"+"Age : "+age);
    //  System.out.println("Inside default Constructor");
    }
    public Human(int age, String name){
        this.age=age;
        this.name=name;
        // System.out.println("Name : "+name +";"+"Age : "+age);
        //  System.out.println("Inside parameterized  Constructor");
    }
    public void getDetails(){
         System.out.println("Name : "+name +";"+"Age : "+age);
    }
    
}
public class constructor {
    public static void main(String[] args) {
        Human obj= new Human();
        Human obj2 = new Human(40,"Sai");
        obj.getDetails();
        obj2.getDetails();
        
       
    }
} 
