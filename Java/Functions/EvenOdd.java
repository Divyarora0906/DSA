public class EvenOdd {
    public static int EvenOdd(int a){
        if(a%2==0){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        int output = EvenOdd(18);
        System.out.println(output == 1 ? "Yes, Even":"No. Its not Even");
    }
    
}
