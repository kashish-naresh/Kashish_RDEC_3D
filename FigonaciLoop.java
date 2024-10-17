/**
 * FigonaciLoop
 */
public class FigonaciLoop {

    public static void main(String[] args) {
        int r=0, p=0;
        for (int i = 1; i < 10; i++) {
            int sum = r + p;
            System.out.print(r + " + ");
            r = p;
            p = sum;
        }
    }
}