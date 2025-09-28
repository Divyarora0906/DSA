public class FunctionOverloading {
    public static int sum(int a, int b){
      return a + b;
    }
    public static float sum(float a, float b){
        return a + b;
    }
    public static void main(String[] args) {
        int IntegerValue = sum(29,30);
        float floatValue = sum(1.2f,2.22f);
        System.out.println(IntegerValue);
        System.out.println(floatValue);

    }
}
