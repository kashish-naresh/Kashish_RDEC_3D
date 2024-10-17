import java.util.Scanner;

public class XStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Size of the diamond
        System.out.println("Enter size : ");
        int n = sc.nextInt();// size of the X shape
        printXStarPattern(n, 0, n - 1);
        sc.close();
    }

    public static void printXStarPattern(int n, int i, int j) {
        if (i < n) {
            printChar(n, 0, i, j);
            System.out.println();
            printXStarPattern(n, i + 1, j - 1);
        }
    }

    public static void printChar(int n, int k, int i, int j) {
        if (k < n) {
            if (k == i || k == j) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            printChar(n, k + 1, i, j);
        }
    }
}