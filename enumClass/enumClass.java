package enumClass;

enum Laptop{
 Macbook(2000), XPS(), HP(3000);
private Laptop(){
    this.price=500;
}
 private int price;
 private Laptop(int price){  // This is created for pass the prices in about enum object/Contsants;
    this.price=price;
 }
 public int getPrice(){
    return price;
 }
 public void setPrice( int price ){
    this.price=price;
 }
}
public class enumClass {
    public static void main(String[] args) {
      Laptop obj = Laptop.XPS;
      System.out.println(obj.getPrice());
    }
}
