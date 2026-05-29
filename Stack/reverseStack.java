package Stack;

import java.util.Stack;

public class reverseStack {
      public static void pushAtbottom(Stack <Integer> st, int data){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int top = st.pop();
        pushAtbottom(st, data);
        st.push(top);
    }
    public static void reverseStack(Stack <Integer> st){
        if(st.isEmpty()){
            return;
        }
        int top = st.pop();
        reverseStack(st);
        pushAtbottom(st, top);
        
    }
    
    public static void print(Stack <Integer> st){
        while(!st.isEmpty()){
            int top = st.pop();
            System.out.println(top);
        }
    }
    public static void main(String[] args) {
        Stack <Integer> st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
       
        reverseStack(st);
        print(st);
        
    }

}
