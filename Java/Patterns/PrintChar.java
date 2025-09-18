public class PrintChar {
    public static void main(String[] args) {
        int A = (int) 'A';
        for(int i = 0; i< 5; i++){
            for(int j = 0; j < i; j++){
                System.out.print((char) A);
                A++;
            }
            System.out.println();
        }
    }
}
