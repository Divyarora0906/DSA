//byte, short or char operand to int
//long, float or double to Big Datatype Respectively

public class TypePromotion {
    public static void main(String args[]){
        // char A = 'a';
        // char B = 'b';
        // System.out.println((int)B);
        // System.out.println((int)A);
        // System.out.println(A);
        // System.out.println(B-A);

        short a = 5;
        byte b = 25;
        char c = 'c';
        byte bt = (byte)(a + b + c);
        System.out.println(bt);

        int A =10;
        float B = 20.98f;
        double C = 30;
        double ans = A+B+C;
        System.out.println(ans);
    }
}
//byte b = 5;
// b = b *2; ❌

//byte b = 5;
//b = (byte) b * 2 ✔️
