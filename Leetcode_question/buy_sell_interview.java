package Leetcode_question;

import java.util.ArrayList;
import java.util.List;

public class buy_sell_interview {
   public static List<Integer> stock(int arr[]){
        List<Integer> nums = new ArrayList<>();
        int max_value = arr[0];
        for (int i = 0 ; i< arr.length ;i++ ){
            if(arr[i] >max_value){
                nums.add(i+1);
                max_value = arr[i];
            }
            else{
                 nums.add(-1);
                max_value = arr[i];
            }
        }
        return nums;
   }
   public static void main(String[] args) {
       int arr[] = {9,30,46,47,14,40,57,26};
       List<Integer> result = stock(arr);
       System.out.println(result);
   }
}
