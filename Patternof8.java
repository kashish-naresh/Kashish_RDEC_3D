import java.util.Scanner;

public class Patternof8 {
    // Method to print stars and spaces based on conditions
    static void printStarLine(int i, int j, int n) {
        if (j >= n) {
            System.out.println();
            return;
        }

        if (i == 0 || i == n - 1 || j == 0 || j == n - 1 || i == n / 2) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }

        printStarLine(i, j + 1, n);
    }

    // Recursive method to handle rows
    static void printPattern(int i, int n) {
        if (i >= n) {
            return;
        }

        printStarLine(i, 0, n);
        printPattern(i + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the pattern: ");
        int n = sc.nextInt();

        printPattern(0, n);
        sc.close();
    }
}
