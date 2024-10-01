public class typeConversionAndCasting {
    public static void main(String[] args) {         // Brackets are necccessary during explict conversion
        int a = 10;                                 // Implict Coversion --> Conversion
        float b = 5.6f ;                           // Explict Conversion --> Casting
         a = (int) b;         // If the range of Datatypes exceeds it converts using modulus function divides and gives the remainder
                              // Type promotions
        System.out.println(a);
    }
}
  