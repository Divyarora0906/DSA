package Java.Arrays;

public class LargestinArray {
    public static void Largest(int arr[]){
        int large = 0;
       for(int i = 0; i < arr.length; i++ ){
        if(arr[i] > large){
            large = arr[i];
        }
       }
       System.out.println(large + " is the Largest in the Array");
    }
    public static void main(String[] args) {
        int arr[] = {1,7,8,10,56,100,34,101,105,150};
        Largest(arr);
    }
}
