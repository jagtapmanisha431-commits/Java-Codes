
import java.util.Scanner;

public class Question5 {

    static int gcd(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }

    static long lcm(int a, int b) {
        return ((long) a / gcd(a, b)) * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("First number: ");
        int a = sc.nextInt();

        System.out.print("Second number: ");
        int b = sc.nextInt();

        if (a <= 0 || b <= 0) {
            System.out.println("Please enter positive integers.");
        } else {
            System.out.println("GCD: " + gcd(a, b));
            System.out.println("LCM: " + lcm(a, b));
        }

        sc.close();
    }
}
