package Java.Arrays;

public class ReverseAnArray {
    public static void PrintArray(int arr[]){
       for(int i = 0; i< arr.length; i++){
          System.out.print(arr[i] + " ");
       }
    }
    public static void reverse(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {12,34,5,6,7,88,99,34,56,123,45};
        reverse(arr);
        PrintArray(arr);
    }
}
