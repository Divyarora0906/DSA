package Variables_Questions;

import java.util.Scanner;

public class AreaofSq {
    public static void main(String[] args) {
        int side;
        Scanner sc = new Scanner(System.in);
        side = sc.nextInt();
        System.out.print("Area of the Square is ");
        System.out.println(side*side);
    }
}
