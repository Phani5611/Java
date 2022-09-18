import java.util.*;
// PRINTING NATURL NUMBERS USING DO-WHILE
class dowhile {
    int logic(int n){
        int result=0;
        do{
        System.out.println(result);
        result++;
        }while(result<n);
        return result;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
       try( Scanner sc = new Scanner(System.in));
        System.out.println("Enter the value of a :");
        int a = sc.nextInt();
        int b;
        dowhile obj = new dowhile();
        b=obj.logic(a);
        System.out.println(b);




    }
}
