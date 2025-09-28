public class SumAll {
    public static void SumAll(int a) {
        int sum = 0;
        while (a > 0) {
            int digit = a % 10;
            sum = sum + digit;
            a = a / 10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        SumAll(289);
    }
}
