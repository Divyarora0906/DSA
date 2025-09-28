package Java.Arrays;

public class LinearSearch {
   public static void printList(int arr[]){
    for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i]);
    }
   }
   public static int LinearSearch(int arr[], int key){
    for(int i = 0; i<arr.length; i++){
        if(key == arr[i]){
            System.out.print("Found at Index " + i);
            return 1;
        }
    }
    return 0;
   }
   public static void main(String[] args) {
     int Book[] = {10, 12, 15, 19, 29, 40, 60, 100};
     LinearSearch(Book, 40);
   }
}
