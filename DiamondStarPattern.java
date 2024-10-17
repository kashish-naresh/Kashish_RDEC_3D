import java.util.Scanner;

public class DiamondStarPattern {
    // Recursive method to print spaces
    static void printSpaces(int n) {
        if (n > 0) {
            System.out.print(" ");
            printSpaces(n - 1);
        }
    }

    // Recursive method to print stars
    static void printStars(int n) {
        if (n > 0) {
            System.out.print("*");
            printStars(n - 1);
        }
    }

    // Recursive method to print the upper part of the diamond
    static void printUpperDiamond(int n, int i) {
        if (i < n) {
            printSpaces(n - i - 1);
            printStars(2 * i + 1);
            System.out.println();
            printUpperDiamond(n, i + 1);
        }
    }

    // Recursive method to print the lower part of the diamond
    static void printLowerDiamond(int n, int i) {
        if (i >= 0) {
            printSpaces(n - i - 1);
            printStars(2 * i + 1);
            System.out.println();
            printLowerDiamond(n, i - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter size : ");
        int n = sc.nextInt();
        printUpperDiamond(n, 0);
        printLowerDiamond(n, n - 2);
        sc.close();
    }
}
