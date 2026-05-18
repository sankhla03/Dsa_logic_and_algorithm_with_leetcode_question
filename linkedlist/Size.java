package linkedlist;

public class Size {
  public static class Node{
    int data;
    Node next;

    public Node(int data){
      this.data = data;
      this.next = null;
    }
  }
   Node head;

  public  void insertAtFirst(int data){
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
  }
  public  int size(){
    int count = 0;
    Node temp = head;

    while( temp != null){
      count ++;
      temp = temp.next;
    }
    return count;
  }
  public static void main(String[] args) {
    Size st = new Size();
    st.insertAtFirst(10);
    st.insertAtFirst(20);
    st.insertAtFirst(30);
    st.insertAtFirst(40);
    st.insertAtFirst(50);
    st.insertAtFirst(60);

    System.out.println("Size of the linked list: " + st.size());
  }
}
