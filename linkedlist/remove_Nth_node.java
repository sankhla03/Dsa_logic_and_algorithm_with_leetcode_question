package linkedlist;

import linkedlist.remove_Nth_node.ListNode;

public class remove_Nth_node {

  public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { 
        this.val = x; 
        this.next = null;}
  } 
       public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        ListNode fast = head;
        

        int count = 0; 

        if(head.next == null){
            head = null;
            return head;
        }
        
        while(fast != null){
            fast = fast.next;
            count ++;
        }
        
        if (count == n){
            return head.next;
        }
        for( int i =0; i< count -n-1; i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;

        return head;
    }
      public static void main(String[] args){
          remove_Nth_node st = new remove_Nth_node();
          ListNode head = new ListNode(1);
          head.next = new ListNode(2);
          head.next.next = new ListNode(3);
          head.next.next.next = new ListNode(4);
          head.next.next.next.next = new ListNode(5);
  
          int n = 2;
          ListNode updatedHead = st.removeNthFromEnd(head, n);
  
          // Print the updated list
          ListNode temp = updatedHead;
          while (temp != null) {
              System.out.print(temp.val + " -> ");
              temp = temp.next;
          }
          System.out.println("null");
      }
}
