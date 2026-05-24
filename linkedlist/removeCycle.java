package linkedlist;

public class removeCycle {
  public static class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    
    public void removeCycle(){
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                break;
            }
        }
        slow = head;
        if(fast == slow){
        while( fast.next != slow){
            fast = fast.next;
        }
        fast.next = null;
        return;
     }
     
      while(slow.next != fast.next){
       slow = slow.next;
       fast = fast.next;
      }

      fast.next = null;
    }
    public void insertend(int data) {
    Node newnode = new Node(data);

    if (head == null) {
      head = newnode;
      return;
    }

    Node current = head;
    while (current.next != null) {
      current = current.next;
    }
    current.next = newnode;
    newnode.next = null;
  }
  
    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
    
    public static void main(String[] args) {
      removeCycle list = new removeCycle();
      list.insertend(1);
      list.insertend(2);
      list.insertend(3);
      list.insertend(4);         
      list.head.next.next.next.next = list.head;

      list.removeCycle(); // Removing the cycle
      list.display(); // Displaying the list after removing the cycle
      
    }
}
