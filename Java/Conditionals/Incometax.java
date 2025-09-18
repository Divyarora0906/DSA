import java.util.Scanner;

public class Incometax {
    public static void main(String[] args) {
        int income;
        Scanner sc = new Scanner(System.in);
        income = sc.nextInt();
        if(income < 500000){
            System.out.println("You have to pay 0% tax");
        }
        else if(income >= 500000 && income <= 1000000){
            System.out.println("You have to Pay Tax of "+ income*0.2);
        }
        else{
            System.out.println("You have to Pay Tax of "+ income*0.3);
        }
    }
}
