package linkedlist;

public class remove {
  public static  class node{
    int data;
    node next;

    public node(int data){
      this.data= data;
      this.next = null;
    }
  }

   node head;
  public  int removefirst(){
    if(head == null){
      return -1;
    }
    int value = head.data;
    head = head.next;
    return value;
  }

  public  int removeend(){
    if(head == null){
      return -1;
    }
    node current = head;
    while(current.next != null && current.next.next != null){
      current = current.next;
    }
    int value = current.next.data;
    current.next = null;
    return value;
  }
  public  void printList(){
    node current = head;
    while(current != null){
      System.out.print(current.data + "-> ");
      current = current.next;
    }
    System.out.println("Null");
  }

  public static void main(String[] args) {
    remove list = new remove();
    list.head = new node(10);
    list.head.next = new node(20);
    list.head.next.next = new node(30);

    System.out.println("Original List:");
    list.printList();
    int removedValue = list.removefirst();
    System.out.println("Removed Value: " + removedValue);
     System.out.println("Updated List:");
     list.printList();
    //  int removedValue2 = removeend();
    // System.out.println("Removed Value: " + removedValue2);

    // System.out.println("Updated List:");
    // printList(list.head);

  }
}
