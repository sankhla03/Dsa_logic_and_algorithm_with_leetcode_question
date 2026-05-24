package linkedlist;

public class MargeList {
  
 
    public class ListNode {
    int val;
    ListNode next;
    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
 }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode  dummy = new ListNode(-1);
        ListNode list = dummy;

        while(list1 != null && list2 != null){
            if( list1.val < list2.val){
                list.next = list1;
                list1 = list1.next;
            }
            else{
                list.next = list2;
                list2 = list2.next;
            }
            list = list.next;
        }

        if(list1 != null){
            list.next = list1;
        }
        else{
            list.next = list2;
        }
        return dummy.next;
    }
}

