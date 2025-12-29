package Leetcode_question;

public class removeDuplicate {
    public static void remove(String str, int idx,StringBuilder newstr, boolean map[]){
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }
        char currchar = str.charAt(idx);
        if(map[currchar -'a']== true){
            remove(str,idx+1,newstr,map);
        }
        else{
            map[currchar -'a']= true;
            remove(str, idx+1, newstr.append(currchar), map);
        }
       
    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        boolean map[] = new boolean[26];
        remove(str, 0, new StringBuilder(""), map);
    }

}
