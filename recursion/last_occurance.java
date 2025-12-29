package recursion;

public class last_occurance {
     public static int last(int arr[], int key , int i){
    //     if(i == 0){
    //         return -1;

    //     }
    //     if(arr[i]== key){
    //         return i;
    //     }
    //     return last(arr, key, i-1);
    // }
    if(i == arr.length-1){
        return -1;
    }
    int isFound =last(arr, key, i+1);
    if(isFound == -1 && arr[i]== key){
        return i;
    }
    return isFound;
}

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,3,7,7};
        int key = 3;
        System.out.println(last(arr,key,0));
    }
}
