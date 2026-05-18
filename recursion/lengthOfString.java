package recursion;

public class lengthOfString {
    public static int Slength(String str,int idx){
        if(str.charAt(idx) == '\0'){
            return idx;
        }
        return Slength(str, idx+1);
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        // Adding a null character at the end to simulate C-style string termination
        str += '\0';
        int length = Slength(str, 0);
        System.out.println("Length of the string is: " + length);
    }
    
}
