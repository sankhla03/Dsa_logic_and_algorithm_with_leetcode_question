package Queue;

public class arrayQueue {
  static int arr[];
  static int  size;
  static int rear ;

  public arrayQueue(int n){
    arr = new int[n];
    size = n;
    rear = -1;
  }

public  boolean isEmpty(){
  return rear == -1;
}

public  void add(int data){
  if(rear == size-1){
    System.out.println("Queue is full..");
    return;
  }
  rear = rear +1;
  arr[rear] = data;
}
public  int remove(){
  if(rear == -1){
    System.out.println("Queue is Empty.");
    return -1;
  }

  int front = arr[0];

  for(int i=0; i<size-1; i++){
    arr[i] = arr[i+1];
  }
  rear--; 
  return front;
}
public  int peek(){
  if(rear == -1){
    System.out.println("Queue is Empty.");
    return -1;
  }

  int front = arr[0];
  return front;
}

public static void main(String[] args) {
    arrayQueue queue = new arrayQueue(5);
    queue.add(1);
    queue.add(2);
    queue.add(3);

    while(!queue.isEmpty()){
      System.out.println(queue.peek());
      queue.remove();
    }
}
}
