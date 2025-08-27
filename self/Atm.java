import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of transaction: ");
        int n = sc.nextInt();
        int balance = 0;
        System.out.println("enter transaction  +ive = deposit , -ive = withdrawl");
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            if(t>0){
                balance += t;
            }
            else balance += t;
        }
        System.out.println("final balance " +balance);
        if(balance <0){
            System.out.println("overdraft");
        }
    }
}
