package Leetcode_question;

public class duplicate {
    public static boolean checkDuplicate(int arr[]){
        // HashSet<Integer> set = new HashSet<>();
        // for (int idx = 0; idx < arr.length; idx++) {
        //     if (set.contains(arr[idx])){
        //         return true;
        //     }
        //     else{
        //         set.add(arr[idx]);
        //     }
        //     }
            
        // return false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    return true;
                }
            }
        }
    return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(checkDuplicate(arr));
    }
}
