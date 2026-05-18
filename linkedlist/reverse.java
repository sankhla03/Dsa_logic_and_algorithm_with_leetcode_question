package linkedlist;

class search {
  
  public static class Node{
    int data;
    Node next;

    public Node(int data){
      this.data= data;
      this.next = null;
    }
  }

  public static Node head;

  public  void insertAtPositon(int data, int index){
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

 public void reverse(){
     Node curr = head;
     Node prev = null;
     
     while(curr != null){
         Node temp = curr.next;
         curr.next = prev;
         prev = curr;
         curr = temp;
     }
     head = prev;
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
        search st = new search();
        st.insertAtPositon(10, 0);
        st.insertAtPositon(20, 0);
        st.insertAtPositon(30, 0);
        st.insertAtPositon(40, 0);
        st.insertAtPositon(50, 0);
        st.insertAtPositon(60, 0);
     
        System.out.println("Updated List:");
        st.printList();
        
        st.reverse();
        System.out.println("Updated List:");
        st.printList();

       
    }
}
