import java.util.Scanner;

public class PowerRec {
    static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        } 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base : ");
        int base = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Exponent : ");
        int exponent = sc.nextInt();
        int result = power(base, exponent);
        System.out.println("The result is: " + result);
        sc.close();
    }
}