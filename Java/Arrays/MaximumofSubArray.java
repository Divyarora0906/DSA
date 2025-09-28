package Java.Arrays;

public class MaximumofSubArray {
    public static void Maxofsub(int arr[]) {
        int maxSum = 0;
        int finalStart = 0;
        int finalEnd = 0;
        for (int i = 1; i < arr.length; i++) {
            int start = i;
            int end = 0;

            int arrSum = 0;
            for (int j = i + 1; j < arr.length; j++) {
                end = j;
                for (int l = start; l < end; l++) {
                    arrSum += arr[l];
                }
                if (arrSum > maxSum) {
                    maxSum = arrSum;
                    finalStart = start;
                    finalEnd = end;
                }
            }
        }
        System.out.println(maxSum + " is of SUM of SUB ARRAY :");
        for (int j = finalStart; j < finalEnd; j++) {
            System.out.print(arr[j] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 12, -22, 13, 23, -55 };
        Maxofsub(arr);
    }
}
