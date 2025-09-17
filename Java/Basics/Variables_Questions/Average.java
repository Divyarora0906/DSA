package Variables_Questions;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int avg = (a+b+c)/3;
        System.out.println(avg);
    }
}
