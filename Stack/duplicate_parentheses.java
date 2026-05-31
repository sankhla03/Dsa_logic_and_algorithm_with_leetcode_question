package Stack;
import java.util.Stack;
public class duplicate_parentheses {
    public static boolean duplicate_parenthese(String str){
        Stack<Character> st = new Stack<>();

        for(char ch : str.toCharArray()){
            if(ch == ')'){
                int count = 0;
                if(st.isEmpty()) return false;

                while( st.peek() != '('){
                    st.pop();
                    count++;
                }
                if(count < 1){
                    return true;
                } 
                else{
                    st.pop();
                }

            } else {
                st.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b))";
        String str1 = "(a+b)";
        System.out.println(duplicate_parenthese(str1));
        System.out.println(duplicate_parenthese(str));
    }
}
