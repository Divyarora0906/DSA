public class PrimeRange {
    public static boolean CheckPrime(int n){
        boolean Ha = true;
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                Ha = false;
                break;
            }
        }
        return Ha;

    }
    public static void PrintinRange(int n){
      for(int i = 2; i<n;i++){
        if(CheckPrime(i)){
            System.out.println(i);
        }
      }
    }
    public static void main(String[] args) {
        int n = 10;
        PrintinRange(n);
    }
}
