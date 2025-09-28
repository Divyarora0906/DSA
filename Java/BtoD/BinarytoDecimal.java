public class BinarytoDecimal {
    public static int BtoD(int n){
       int pow = 0;
       int decimal = 0;
       while (n > 0) {
        int lastDigit = n%10;
         decimal = decimal + (lastDigit * (int)Math.pow(2, pow));
         pow++;
         n = n/10;
       }
      return decimal;
    }
    public static void main(String[] args) {
        int finalval = BtoD(1000);
        System.out.println(finalval);
    }
}
