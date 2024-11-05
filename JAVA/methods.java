//import java.util.*;
class methods{
    int logic(int x,int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=x*y;
        }
        return z;
    }
    public static void main(String[] args) {
         int a;
        // Scanner sc = new Scanner (System.in);
        // a=sc.nextInt();
        // b=sc.nextInt();
        methods obj = new methods();
        a=obj.logic(20,30);
        System.out.println(a);
        

        
    }
}