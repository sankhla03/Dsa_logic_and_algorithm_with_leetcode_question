package String;

public class largest_ser {
    public static void largestString(String str[]){
        String largest = str[0];
        for(int i =1; i<str.length; i++){
            if((largest.compareToIgnoreCase((str[i])))<0){
                largest = str[i];
            }
        }
        System.out.println(largest);

    }
    public static void main(String[] args) {
        String str[] = {"Ashok", "become","billinior"};
        largestString(str);

    }
}
