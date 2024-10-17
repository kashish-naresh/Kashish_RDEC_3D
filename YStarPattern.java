import java.util.Scanner;

public class YStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Size of the diamond
        System.out.println("Enter size : ");
        int n = sc.nextInt(); // Size of the pattern
        printXStar(n, 0);
        sc.close();
    }

    static void printXStar(int n, int i) {
        if (i < n) {
            printSpaces(i);
            System.out.print("*");
            printSpaces(2 * (n - i - 1));
            if (i != n - 1) {
                System.out.print("*");
            }
            System.out.println();
            printXStar(n, i + 1);
            printSpaces(i);
            if (i != n - 1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printSpaces(int count) {
        if (count > 0) {
            System.out.print(" ");
            printSpaces(count - 1);
        }
    }
}
