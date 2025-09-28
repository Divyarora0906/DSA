package Java.Arrays;

public class BinarySearch {
    public static int BinarySearch(int arr[], int key){
        int start = 0; int end = arr.length - 1;
        while (start <= end) {
            int mid = (start+end)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
   public static void main(String[] args) {
    int arr[] = {1,5,8,10,15,20,24,34,55,76,88};
    int found = BinarySearch(arr, 55);
    System.out.println("Found the Value at "+ found );
   }    
}
