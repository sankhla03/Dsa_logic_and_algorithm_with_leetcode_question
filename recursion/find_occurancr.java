package recursion;

public class find_occurancr {
    public static void findOccurence(int arr[], int key, int idx){
        if(idx == arr.length){return;}
        if(arr[idx] == key){
            System.out.print(" "+idx);
           
        }
         findOccurence(arr, key, idx+1);
         System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,2,5,2,6};
        int key = 2;
        findOccurence(arr, key, 0);
    }
}
