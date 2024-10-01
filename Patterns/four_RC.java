package Patterns;
// ****
// ****
// ****
// ****
public class four_RC {
    public static void main(String[] args) {
        char ch='a';
        int asciival=ch;
        for(int i=5;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print((asciival));
            }ch--;
            System.out.println();
        }
    }
}
