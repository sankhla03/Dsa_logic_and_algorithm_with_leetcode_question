package Leetcode_question;

import java.util.HashMap;

public class numberOfOccurance {
    public static void occurance(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4,4,4,5,1,1,2};
        occurance(arr);
    }
}
