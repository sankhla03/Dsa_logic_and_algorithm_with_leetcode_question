package sorting;

public class bublesort {
    public static void sorting(int  arr[]){
        for(int i =0; i<arr.length-1; i++){
            int flag = 0;
            for (int j=0; j< arr.length-1-i; j++) {
                if(arr[j]< arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag =1;    
                }
                
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        sorting(arr);
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();     
    }
}
