package Leetcode_question;

// public class sum_subarray {
//     public static void sum(int arr[]){
//         int min1 = Integer.MIN_VALUE;
//          int sum = 0;
//         int max2 = Integer.MAX_VALUE;
//         for (int i = 0; i<arr.length; i++){
//             for (int j=i; j<arr.length; j++){
//                 sum = 0;
//                 for (int k =i; k<=j; k++){
//                     sum += arr[k];
//                     System.out.print(arr[k] + " ");
//                 }
//                 System.out.print(" = " + sum);

//                if(sum > min1){
//                      min1 = sum;
                        
//                }
//                else if (sum < max2){
//                     max2 = sum;
//                 }
//                   System.out.println();
//             }                    
//         }
//         System.out.println(" Max sum: " + min1);
//           System.out.println(" Min sum: " + max2);
//     }
//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5};
//         sum(arr);
//     }
// } 


// updated code for this is 
// public class sum_subarray {
//     public static void sum(int arr[]){
//         int min1 = Integer.MIN_VALUE;
//         int max2 = Integer.MAX_VALUE;

//         int prefixsum[] = new int[arr.length];

//         prefixsum[0] = arr[0];

//         for (int i = 1; i< arr.length; i++){
//             prefixsum[i] = prefixsum[i-1] + arr[i];
//         }

//         for (int i = 0; i<arr.length; i++){
//             for (int j=i; j<arr.length; j++){
                
//                int sum = i ==0 ? prefixsum[j] : prefixsum[j] - prefixsum[i-1];
             
//                if(sum > min1){
//                      min1 = sum;        
//                }
//                else if (sum < max2){
    //                 max2 = sum;
    //             }  
    //         }
    //     }
    //     System.out.println(" Max sum: " + min1);
    //     System.out.println(" Min sum: " + max2);
    // }

public class sum_subarray {
    public static int kadane_algo(int arr[]){
        int max = Integer.MIN_VALUE;
        int curr = 0;

        for (int i =0; i<arr.length; i++){
           curr = curr + arr[i];
           if(curr<0){
            return 0;
           }
           max = Math.max(max, curr);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,-6,5,3,-2};
        System.out.println(kadane_algo(arr));
    }
}