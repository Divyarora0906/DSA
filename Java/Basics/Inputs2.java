
//Input Functions in Java
//1. next() - reads input till space
//2. nextLine() - reads input till new line
//3. nextInt() - reads integer input
//4. nextFloat() - reads float input
//5. nextDouble() - reads double input
//6. nextBoolean() - reads boolean input
//7. nextByte() - reads byte input
//8. nextShort() - reads short input
//9. nextLong() - reads long input
//10. nextBigInteger() - reads BigInteger input
//11. nextBigDecimal() - reads BigDecimal input

import java.util.Scanner;

public class Inputs2{
    public static void main(String[] args) {
        String A;
        Scanner sc = new Scanner(System.in);
        A = sc.nextLine();
        System.out.println("The input string is: " + A);
    }
}