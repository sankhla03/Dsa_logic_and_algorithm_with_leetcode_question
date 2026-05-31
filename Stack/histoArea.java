package Stack;

import java.util.Stack;

public class histoArea {
   public static int maxArea(int[] height){
        int[] leftSmaller = new int[height.length];
        int[] rightSmaller = new int[height.length];
        Stack<Integer> st = new Stack<>();
        int maxarea =0;
        // left smaller..
        for( int i=0; i<height.length; i++){
         while(!st.isEmpty() && height[st.peek()] >= height[i]){
                st.pop();
            }
            if(st.isEmpty()){
                leftSmaller[i] = -1;
            }else{
                leftSmaller[i] = st.peek();
            }
            st.push(i);
        }
        st.clear();
        // right Smaller...
        for( int i=height.length-1; i>=0; i--){
         while(!st.isEmpty() && height[st.peek()] >= height[i]){
                st.pop();
            }
            if(st.isEmpty()){
                 rightSmaller[i] = height.length;
            }else{
                rightSmaller[i] = st.peek();
            }
            st.push(i);
        }
        for(int i=0; i<height.length; i++){
            int width = rightSmaller[i] - leftSmaller[i] -1;
            int area = height[i] * width;
            
            maxarea = Math.max(area,maxarea);
        }
        return maxarea;  
    }
    public static void main(String[] args) {
        int[] height = {2,1,5,6,2,3};
        
        System.out.println(maxArea(height));
    }
}
