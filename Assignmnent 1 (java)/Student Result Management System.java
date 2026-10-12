import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;
    private int m1, m2, m3, m4, m5;

    Student(String name, int rollNumber,
            int m1, int m2, int m3, int m4, int m5) {

        if (m1 < 0 || m1 > 100 ||
            m2 < 0 || m2 > 100 ||
            m3 < 0 || m3 > 100 ||
            m4 < 0 || m4 > 100 ||
            m5 < 0 || m5 > 100) {

            throw new IllegalArgumentException(
                "Marks must be between 0 and 100."
            );
        }

        this.name = name;
        this.rollNumber = rollNumber;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
        this.m5 = m5;
    }

    public int calculateTotal() {
        return m1 + m2 + m3 + m4 + m5;
    }

    public double calculatePercentage() {
        return calculateTotal() / 5.0;
    }

    public String calculateResult() {
        if (m1 >= 40 && m2 >= 40 &&
            m3 >= 40 && m4 >= 40 && m5 >= 40) {
            return "PASS";
        }
        return "FAIL";
    }

    public void displayResult() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total Marks: " + calculateTotal() + "/500");
        System.out.println("Percentage: " + calculatePercentage() + "%");
        System.out.println("Result: " + calculateResult());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Roll Number: ");
            int roll = sc.nextInt();

            System.out.println("Enter marks for five subjects:");

            int m1 = sc.nextInt();
            int m2 = sc.nextInt();
            int m3 = sc.nextInt();
            int m4 = sc.nextInt();
            int m5 = sc.nextInt();

            Student s = new Student(name, roll, m1, m2, m3, m4, m5);

            s.displayResult();

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

                
            
