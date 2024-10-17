import java.util.Scanner;

public class RightArrowPattern {

    // Function to print spaces
    static void printSpaces(int n) {
        if (n == 0)
            return;
        System.out.print(" ");
        printSpaces(n - 1);
    }

    // Function to print stars
    static void printStars(int n) {
        if (n == 0)
            return;
        System.out.print("*");
        printStars(n - 1);
    }

    // Recursive function to print the lower part of the arrow first (rotated upper part)
    static void printLowerPart(int n, int row) {
        if (row == n)
            return;
        printStars(row + 1);
        printSpaces(n - row - 1);
        System.out.println();
        printLowerPart(n, row + 1);
    }

    // Recursive function to print the upper part of the arrow last (rotated lower part)
    static void printUpperPart(int n, int row) {
        if (row == n)
            return;
        printStars(n - row);
        printSpaces(row);
        System.out.println();
        printUpperPart(n, row + 1);
    }

    // Driver function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the arrow: ");
        int n = sc.nextInt();

        // Print the lower part of the arrow (rotated upper part)
        printLowerPart(n - 1, 0);

        // Print the upper part of the arrow (rotated lower part)
        printUpperPart(n, 0);

        sc.close();
    }
}
