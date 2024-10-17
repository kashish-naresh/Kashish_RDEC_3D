public class PrintCount {

    static void printCal(int i){
        if (i== 0){
            return;

        }
        System.out.println(i);
        printCal( i - 1 );
        System.out.println(i);
    }
    public static void main(String[] args) {
        printCal(5);
    }
}
