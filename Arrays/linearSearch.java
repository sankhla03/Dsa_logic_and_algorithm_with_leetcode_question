package Arrays;

public class linearSearch {
    public static int search(int arr[], int target){
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nuns[ ]= {23,34,45,67,87,54,32};
        int target = 50;
        int result = search(nuns, target);
        System.out.println(result);
    }
}
