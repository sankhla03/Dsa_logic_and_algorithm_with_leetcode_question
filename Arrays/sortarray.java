package Arrays;

import java.util.*;

public class sortarray {
  
    public static void main(String[] args) {
        int arr[] = {5,2,8,1,3};
        Arrays.sort(arr);
       for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
       }
       System.out.println();
    }
}
