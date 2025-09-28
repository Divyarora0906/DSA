import java.util.Scanner;

public class BinomialCoff {
    public static int coff(int n, int r){
        // nCr
        int Upper = 1, Middle = 1, lower = 1;
        
        for(int i=1;i<=n;i++){
            Upper*=n;
        }
        for(int j = 1;j<=r;j++){
            Middle*=r;
        }
        for(int k = 1; k< n-r;k++){
            lower*=k;
        }
        return Upper/(Middle*lower);
    }
    public static void main(String[] args) {
        int n = 5,r =2;
        // Scanner sc = new Scanner(System.in);
        // n = sc.nextInt();
        // r = sc.nextInt();
        int val = coff(n, r);
        System.out.println(val);
    }
}
