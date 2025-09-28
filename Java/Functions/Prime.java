public class Prime {
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
    public static void main(String[] args) {
        boolean isPrime = CheckPrime(7);
        System.out.println(isPrime);
    }
}
