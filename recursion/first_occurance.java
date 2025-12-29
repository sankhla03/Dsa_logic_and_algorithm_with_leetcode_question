package recursion;

public class first_occurance {
    public static int first_occurance(int arr[], int key , int i){
        if(i == arr.length){
            return -1;

        }
        if(arr[i]== key){
            return i;
        }
        return first_occurance(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,3,7,3};
        int key = 9;
        System.out.println(first_occurance(arr,key,0));
    }
}
