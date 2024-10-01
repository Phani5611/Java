package TCSNQTPrep;
import java.util.*;

public class inputFormat{
public static int findSubArraySum(ArrayList<Integer> arr, int size){
int sum = 0;
int max= Integer.MIN_VALUE;
for(int i = 0 ;i<size;i++){
sum  = sum + arr.get(i);
if(sum>max) max = sum;
if(sum<0)sum=0;
}
return max;
}
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
String size = sc.nextLine().trim();
int arrSize;
        try {
            arrSize = Integer.parseInt(size);
        } catch (NumberFormatException e) {
            System.out.println("Invalid size input. Please enter an integer.");
            sc.close();
            return;
        }

ArrayList<Integer> arr = new ArrayList<Integer>();


   // Read the array elements
   String input = sc.nextLine();
   
   if(input.startsWith("[") && input.endsWith("]")){
   input =  input.substring(1, input.length()-1).trim();
   }
   String[] inputs = input.split(",");
   
   for (String str : inputs) {
       try {
           arr.add(Integer.parseInt(str.trim()));
    }
    catch (NumberFormatException e) {
           System.out.println("Invalid input, please enter integers only.");
        
       }
   }
   for(int i : arr){
    System.out.print(i);
   }
   
   if (arr.size() != arrSize) {
       System.out.println("Size mismatch.");
       return;
   }

   int result = findSubArraySum(arr, arrSize);
   System.out.print(result);
}
}