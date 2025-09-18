import java.util.Scanner;

public class ParamsF {
    public static int Add(int a, int b){
      return a+b;
    }
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        int sum = Add(a, b);
        System.out.println("Sum is" + sum);
    }
}
