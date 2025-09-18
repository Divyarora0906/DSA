import java.util.Scanner;

public class Largestof2 {
   public static void main(String[] args) {
    int a, b;
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    b = sc.nextInt();
    if(a>b){
        System.err.println("A is Bigger than B");
    }
    else if(a == b){
        System.err.println("Both are Equal");
    }
    else{
        System.out.println("B is Bigger than A");
    }
   }    
}
