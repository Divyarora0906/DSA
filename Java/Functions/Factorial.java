public class Factorial {
    public static int Factorials(int n){
        int fact = 1;
        for(int i = 1; i<=n; i++){
         fact*=i;
       }
        return fact;
    }
    public static void main(String args[]) {
       int factorialof2 = Factorials(4);
       System.out.println(factorialof2);
    }
}
