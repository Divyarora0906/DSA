package Java.AdvancedPatterns;

public class ButterflyPatterns {
    public static void main(String[] args) {
        for(int i = 1; i<=4; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            for(int k = 2*(4-i); k >= 0; k--){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
          for(int i = 4; i>=0; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            for(int k = 2*(4-i); k >= 0; k--){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
