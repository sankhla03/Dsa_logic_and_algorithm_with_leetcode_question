package linkedlist;

class deletePosition {
  
  public static class Node{
    int data;
    Node next;

    public Node(int data){
      this.data= data;
      this.next = null;
    }
  }

  public Node head;

  public void insertAtPositon(int data, int index){
    Node newNode = new Node(data);
    Node current = head;
    
    
    if (index == 0){
      newNode.next = head;
      head = newNode;
      return;
    }
    
    for( int i =0; i<index-1; i++){
        current = current.next;
    }
    newNode.next = current.next ;
   current.next = newNode;
   
  }
    public int deleteAtPositon( int index){
    Node current = head;
    Node temp = head.next;

    if (index == 0){
      int value = head.data;
      head = head.next;
      return value;
    }
    
    for( int i =0; i<index-1; i++){
        current = current.next;
        temp = temp.next;
    }
    int value = temp.data;
     current.next = temp.next;
     return value;
   
  }
  public  void printList(){
      Node temp = head;
      while(temp != null){
          System.out.print(temp.data +"->");
          temp = temp.next;
      }
      System.out.println("Null");
  }
    public static void main(String[] args){
        deletePosition st = new deletePosition();
        st.insertAtPositon(10, 0);
        st.insertAtPositon(20, 0);
        st.insertAtPositon(30, 0);
        st.insertAtPositon(40, 0);
        st.insertAtPositon(50, 0);
        st.insertAtPositon(60, 0);

        System.out.println("Updated List:");
        st.printList();

       int value = st.deleteAtPositon(2);

        System.out.println("After deleting at index 2: " +value);
        st.printList();
    }
}
