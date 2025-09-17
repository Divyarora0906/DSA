package Variables_Questions;

import java.util.Scanner;

public class Threeitems {
    public static void main(String[] args) {
        float a,b,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        float totalCost = a+b+c;
        float GST = (float) ((a+b+c) * 0.18);
        float FinalCost = totalCost + GST;
        System.out.println(FinalCost);
    }
}
