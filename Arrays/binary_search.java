package Arrays;

public class binary_search {
    public static int binary(int arr[], int key){
        int l = 0;
        int h = arr.length - 1;
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid]== key){
                return mid;
            }
            else if(arr[mid] >key){
                h = mid-1;

            }
            else{
                l = mid +1;
            }
        }
        return l;
    }
    public static void main(String[] args) {
        int arr[] ={2,4,6,8,10,12,14,16,18,20};
        int key = 22;
        int result = binary(arr, key);
        System.out.println(result);
    }
}
