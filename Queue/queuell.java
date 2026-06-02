package Queue;

public class queuell {
  public static class node{
    int data;
    node next;
    public node(int data){
      this.data = data;
      this.next = null;
    }
  }
  static class queueLink{
    node head = null;
    node tail = null;

   
   public boolean isEmpty(){
    return head == null && tail == null;
   }

   public void add(int data){
    node newNode = new node(data);
    if(head == null){
      head = tail = newNode;
      return;
    }
     tail.next = newNode;
     tail = newNode;
   }
   public int remove(){
    if(isEmpty()){
      System.out.println("queue is empty");
      return -1;
    }
    int res = head.data;
    if(head == tail){
      head = tail =  null;
    }
    else{
      head = head.next;
    }
    return res;
   }
  
  public int peek(){
    if(isEmpty()){
      System.out.println("queue is empty");
      return -1;
    }
    return head.data;
  }

  public static void main(String[] args) {
      queueLink qlink = new queueLink();
      qlink.add(1);
      qlink.add(2);
      qlink.add(3);
       qlink.remove();
      qlink.add(4);

      while(!qlink.isEmpty()){
        System.out.println(qlink.peek());
        qlink.remove();
      }
  }
  }
}
