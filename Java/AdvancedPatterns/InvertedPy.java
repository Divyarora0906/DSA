package Java.AdvancedPatterns;

public class InvertedPy {
    public static void main(String[] args) {
     for(int i = 1; i<=4;i++){
        for(int k = 1; k <= 4-i; k++){
            System.out.print(' ');
        }
        for(int m  = 1; m <= i; m++){
            System.out.print("*");
        }
        System.out.println();
     }
    }
}
