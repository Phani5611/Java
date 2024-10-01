package Queue;

class Queue{
   private int arr[];
   private int count;
   private int size;
   private  int front;
   private int rear;
  public  Queue(int size){
        this.size=size;
        this.arr=new int[size];
        this.front=-1;
        this.rear=-1;
        this.count=0;
    }
    
    public void push(int ele){
        if(count==size)System.out.println("Queue is full");
        if(count==0){
            front=0;
            rear=0;
        }
        else rear = (rear+1)%size;
        
            arr[rear]=ele;
            count++;
            // System.out.println("Pushed");
        }
    public void pop(){
        if(count==0) System.out.println("Empty Queue Nohting to Pop");;
        int peekEle = arr[front];
        if(count==1){ //Will Destroy the queue , so we save element iin the above line
            front=-1;
            rear=-1;
        }
        front=(front+1)%size;
        count--;
        System.out.println("Popped : "+peekEle);
    }
    public void print(){
        for(int i = 0;i<count;i++){
            System.out.println(arr[(front+i)%size]);
        } 
        }
}

public class queueUsingArray {
    public static void main(String[] args) {
    Queue qm = new Queue(5);
    qm.push(3);
    qm.push(4);
    qm.push(10);
    qm.push(2);
    qm.push(99);
    qm.pop();
    qm.pop();
    qm.pop();
    qm.pop();
    qm.print();
    }
}
