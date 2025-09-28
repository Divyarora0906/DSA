public class Palindrome {
    public static int CheckPalindrom(int n) {
        int dn = n;
        int reversedN = 0;
        int pow = 0;
        while (n > 0) {
            int rem = n % 10;
            reversedN = reversedN * 10 + rem;
            pow++;
            n = n / 10;
        }
        System.out.println(reversedN);
        if (reversedN == dn) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int finalCheck = CheckPalindrom(1121);
        if (finalCheck == 1) {
            System.out.println("Palindrome");
        }
    }
}
