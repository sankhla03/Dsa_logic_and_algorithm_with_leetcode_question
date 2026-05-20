package linkedlist;

public class polindrom {
   public static class Node{
    int data;
    Node next;

    public Node(int data){
      this.data = data;
      this.next = null;
    }
   }

    public Node head; 
    public Node midNode(){
       
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
          slow = slow.next;
          fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPolidrom(){
      // if my link list have 1 or 0 node then it is polindrom
      if(head == null || head.next == null){
        return true;
      }
      Node mid = midNode();
      Node prev = null;
      Node curr = mid;
        
      // reverse the second half of the linked list
      while(curr != null){
        Node temp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = temp;
      }

      // compare the first half and the reversed second half of the linked list
      Node left = head;
      Node right = prev;

        while ( right != null){
          if ( right.data != left.data){
            return false;
          }
          right = right.next;
          left = left.next;
        }
        return true;
    }
    public void insertAtEnd(int data){
      Node newNode = new Node(data);
      if ( head == null){
        head = newNode;
        return;
      }
      Node temp = head;
      while(temp.next != null){
        temp = temp.next;
      }
      temp.next = newNode;
    }
    
    public static void main(String[] args) {
        
        polindrom st = new polindrom();
        st.insertAtEnd(10);
        st.insertAtEnd(20);
        st.insertAtEnd(30);
        st.insertAtEnd(20);
        st.insertAtEnd(10);

        boolean isPolindrom = st.checkPolidrom();
        System.out.println("Is the linked list a palindrome? " + isPolindrom);
    }

    
}
