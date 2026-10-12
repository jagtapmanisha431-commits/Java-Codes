
import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        int number = sc.nextInt();

        if (number < 1) {
            System.out.println("enter an integer greater than or equal to 1.");
        } else if (number == 1) {
            System.out.println("Prime factorization: 1 has no prime factors.");
        } else {
            int n = number;
            int factor = 2;
            boolean first = true;

            System.out.print("Prime factorization: ");

            while (n > 1) {
                int count = 0;

                while (n % factor == 0) {
                    count++;
                    n = n / factor;
                }

                if (count > 0) {
                    if (!first) {
                        System.out.print(" x ");
                    }

                    System.out.print(factor + "^" + count);
                    first = false;
                }

                factor++;

                if ((long) factor * factor > n && n > 1) {
                    if (!first) {
                        System.out.print(" x ");
                    }

                    System.out.print(n + "^1");
                    n = 1;
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
