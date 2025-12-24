package Leetcode_question;

public class shortedPath {
    public static int shorted(String str){
        int x = 0;
        int y =0;
        for (int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'w'){
                x--;
            }
            else if (str.charAt(i) == 's'){
                y--;

            }
             else if(str.charAt(i) == 'e'){
                x++;
            }
            
            else if (str.charAt(i) == 'n'){
                y++;

            }
           

        }
        return (int) Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
    }
    public static void main(String[] args) {
        String direction = "wneenesennn";
        int distance = shorted(direction);
        System.out.println(distance);
    }
}
