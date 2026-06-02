package Queue;

public class circularQueue {
  static int arr[];
  static int size;
  static int rear;
  static int front;

  circularQueue(int n){
    arr = new int[n];
    size =n;
    rear = -1;
    front = -1;
  }
  
  public boolean isEmpty(){
    return (rear == -1 && front == -1);
  }
  

  public boolean isFull(){
    return (rear+1)%size == front;
    
  }

  public void add(int data){
    if(isFull()){
      System.out.println("queue is full");
      return;
    }
    if(front ==-1){
      front =0;
    }
    rear = (rear+1)%size ;
    arr[rear] = data;
  }

  public int remove(){
    if(isEmpty()){
      System.out.println("queue is Empty");
      return -1;
    }

    int res = arr[front];
    if(rear == front){
     rear = -1;
     front = -1;
    }
    else{
     front = (front+1)%size ;
    }
    
    return res;
  }
  public int peek(){
    return arr[front];
  }

  public static void main(String[] args) {
      circularQueue cq = new circularQueue(3);

      cq.add(1);
      cq.add(2);
      cq.add(3);
      System.out.println(cq.remove());
      cq.add(4);
      System.out.println(cq.remove());
      cq.add(5);

      while(!cq.isEmpty()){
        System.out.println(cq.peek());
        cq.remove(); 
      }
  }
}
