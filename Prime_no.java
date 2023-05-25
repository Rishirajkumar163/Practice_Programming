import java.util.Scanner;

public class Prime_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        find_prime_no(n);

    }
    public static void find_prime_no(int n){
        int prime=0;

        if(n<2)
            System.out.println(n+" is Not a Prime No.");
            else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is Not  a Prime No.");
                    prime += 1;
                    break;
                }
            }
            if (prime==0)
                System.out.println(n + " is a Prime No.");
        }
    }
}