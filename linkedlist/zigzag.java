package linkedlist;

public class zigzag {
   public class ListNode {
       int val;
       ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
  }
    
    public ListNode getMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        
        while (curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    public ListNode zigzag(ListNode head){
        ListNode mid = getMid(head);
        ListNode second = reverse(mid.next);
        mid.next = null;
        ListNode first = head;
        
        while(first != null && second != null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;
            first.next = second;
            second.next= temp1;
            
            first = temp1;
            second = temp2;
        }
        return head;
    }
    // Print list
    public void display(ListNode head) {

        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        zigzag obj = new zigzag();

        ListNode head = obj.new ListNode(1);
        head.next = obj.new ListNode(2);
        head.next.next = obj.new ListNode(3);
        head.next.next.next = obj.new ListNode(4);
        head.next.next.next.next = obj.new ListNode(5);

        head = obj.zigzag(head);

        obj.display(head);
    }
}
