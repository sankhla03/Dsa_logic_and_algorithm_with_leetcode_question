package backtracking;

public class backtrack_array {
    public static void backtrack(int []arr, int i, int val){
        if(i == arr.length){
            printarry(arr);
            return;
        }
        arr[i] = val;
        backtrack(arr, i+1, val+1);
        arr[i] =val-2;

    }
    public static void printarry(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        backtrack(arr,0,1);
        printarry(arr);

    }
    
}
