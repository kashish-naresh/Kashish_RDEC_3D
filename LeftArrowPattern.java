import java.util.Scanner;
public class LeftArrowPattern {

    // Method to print spaces
    static void printSpaces(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }
    }

    // Method to print stars
    static void printStars(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the arrow: ");
        int n = sc.nextInt(); // Size of the pattern

        // Upper part of the pattern
        for (int i = n; i > 0; i--) {
            printStars(i);
            printSpaces(n - i);
            System.out.println();
        }

        // Lower part of the pattern
        for (int i = 2; i <= n; i++) {
            printStars(i);
            printSpaces(n - i);
            System.out.println();
        sc.close();
        }
    }
}
