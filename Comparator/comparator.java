package Comparator;

import java.util.Comparator;
import java.util.Arrays;
class Item{
    int value;
    int weight;
    Item(int x,int y){
        this.value = x;
        this.weight=y;
    }

}
public class comparator {
    public static int knapsackWeight(Item arr[], int n,int w){
      Comparator<Item> comp = new Comparator<Item>(){
         public int compare(Item i, Item j){
            int r1 = i.value/i.weight;
            int r2 = j.value/j.weight;
            return r1< r2 ?1:-1;
         }
        };
        int totalValue = 0;
        for(int i = 0;i<n;i++){
        if(arr[i].weight <= w){
            totalValue =totalValue + arr[i].value;
            w= w - arr[i].weight;
        }
        else{
            totalValue  = totalValue  + (arr[i].value/arr[i].weight) * w;
            break;
        }
    }
    return totalValue;
    }
    
    public static void main(String[] args) {
    int n = 3; int w = 4;
    Item boxesType[]={new Item (1,3),new Item(2,2),new Item(3,3)};
    int res = knapsackWeight(boxesType,n,w);
    System.out.println(res);
    }
}

