import java.util.Scanner;

public class PrimeThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        boolean isPrime = true;

        System.out.print("Please enter a number and I'll let you know if it is prime or not: ");
        num1 = sc.nextInt();

        for (int i = 1; i <= num1; i++) {
            if (i == 1 || i == 2) {
                isPrime = false;
              if (i ==1) {
                  System.out.println(i + " is not a prime number.");
              } else if (i == 2) {
                  System.out.println(i + " is a prime number.");
              }
            } else {
                for (int x = 2; x < i; x++) {
                    if (i % x == 0) {
                        isPrime = false;
                        break;
                    } else {isPrime = true;}
                }
                if (isPrime) {
                    System.out.println(i + " is a prime number.");
                } else {
                    System.out.println(i + " is not a prime number.");
                }
            }
        }

    }
}
