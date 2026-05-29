package Stack;

public class using_linkedlist {
      static class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class stack{
           static Node head = null;
        
        //check is empty or not..
        public boolean isEmpty(){
            return head == null;
        }
        
        // push
        public void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        
        //pop
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        
        //Peek..
         public int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        
        stack st = new stack();
        st.push(20);
        st.push(10);
        st.push(5);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
        st.pop();
        st.pop();
        System.out.println(st.isEmpty());
    }
}
