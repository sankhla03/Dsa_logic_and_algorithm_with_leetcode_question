package Arraylist;

public class monolithic {
  public static void main(String[] args) {
    int arr[] = {1, 2, 2, 4, 5};
    int n = arr.length;

    boolean nonDecreasing = true;
    boolean nonIncreasing = true;

    for (int i = 0; i < n - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        nonDecreasing = false;
      }
      if (arr[i] < arr[i + 1]) {
        nonIncreasing = false;
      }
    }

    if (nonDecreasing || nonIncreasing) {
      System.out.println("Monotonic");
    } else {
      System.out.println("Not Monotonic");
    }
  }
}
