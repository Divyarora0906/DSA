package Java.AdvancedPatterns;

public class Rhombus {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            for (int j = 7; j >= i; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k < 7; k++) {
               if(k==0 || i == 6 || i == 0 || k == 6){
                System.out.print("* ");
               }
               else{
                System.out.print("  ");
               }
            }
            System.out.println();
        }
    }
}
