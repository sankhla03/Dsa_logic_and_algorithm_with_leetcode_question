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

// public static int search(int key){
//     Node curr = head;
//     int idx = 0;
//     while(curr != null){
//         if(curr.data == key){
//             return idx;
//         }
//         curr = curr.next;
//         idx++;
//     }
//      return -1;
// }
public  int searchHelper(Node head, int key){
  if(head == null){
      return -1;
  }
  if(head.data == key){
      return 0;
  }
  int idx = searchHelper(head.next, key);
  
  if(idx == -1){
      return -1;
  }
  return idx +1;
}
public  int search(int key){
  return searchHelper(head, key);
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
        System.out.println("Key placed at index: " + st.search(45));

       
    }
}
