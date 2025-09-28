package Java.AdvancedPatterns;

public class InvertedNumber {
    public static void main(String[] args) {
        for(int i = 5; i>=0;i--){
            for(int k = 1; k<=i;k++){
               System.out.print(k);
            }
            System.out.println();
        }
    }
}
