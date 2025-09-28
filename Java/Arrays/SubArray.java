package Java.Arrays;

public class SubArray {
    public static void SubArray(int arr[]){
      for(int i = 0; i < arr.length; i++){
        int start = i;
        int end = 0;
        for(int j = i; j < arr.length; j++){
            end = j;
            for(int k = start; k <= end; k++){
                System.out.print(arr[k]+ " ");
            }
            System.out.println();
        }
      }
    }
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6,7,9};
        SubArray(arr);
    }
}
