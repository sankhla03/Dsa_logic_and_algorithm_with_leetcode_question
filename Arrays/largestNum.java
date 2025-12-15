package Arrays;
public class largestNum {
    public static int largest(int arr[]){
        int value = Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++){
            if(arr[i] > value){
                value = arr[i];
            }        
        }
        return value;
    }
    public static void main(String[] args) {
        int num[] = {20,23,56,78,54,11,34,102};
        int reslt = largest(num);
        System.out.println(reslt);
    }
}
