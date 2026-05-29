package Stack;

public class revese {
  // public String reveseString(String str){
  //       Stack<Character> st = new Stack<>();
        
  //       for(char ch : str.toCharArray()){
  //           st.push(ch);
  //       }
  //       StringBuilder s = new StringBuilder("");
        
  //       while(!st.isEmpty()){
  //           s.append(st.pop());
  //       }
  //       return s.toString();
  //   }
    public static void main(String[] args) {
        // revese st = new revese();
        String str = "abc";
        StringBuilder s = new StringBuilder(str);
        s.reverse();
        System.out.println(s.toString());
        // System.out.println(st.reveseString(str));
    }
}
