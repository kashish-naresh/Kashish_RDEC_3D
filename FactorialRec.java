import java.util.Scanner;

public class FactorialRec {

    static int fact(int f){
        if(f==0 || f==1){
            return 1;
        }
        else{ 
            return f*fact(f-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        
        int result = fact(n);

        System.out.println("Factorial of "+n+" is "+result);

        sc.close();
    }
}
