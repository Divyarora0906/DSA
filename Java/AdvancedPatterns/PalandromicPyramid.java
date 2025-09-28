package Java.AdvancedPatterns;

public class PalandromicPyramid {
    public static void main(String[] args) {
        int kgf = 1;
        for(int i = 1; i <= 5; i++){
            for(int k = 5; k>=i; k--){
                System.out.print(" ");
            }
            for(int l = i; l>=1; l--){
                System.out.print(l);
            }
             for(int m = 2; m<=i; m++){
                System.out.print(m);
            }
            System.out.println();
        }
    }
}
