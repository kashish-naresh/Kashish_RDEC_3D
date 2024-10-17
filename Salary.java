import java.util.*;
import java.text.*;
public class Salary {

    static String printTotal(Locale locale, int tot){
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        return nf.format(tot);
        // System.out.println(nf.format(12500));
    }
/* 
    static String printDate(Locale locale){
        Date date = new Date();
        DateFormat dtf = DateFormat.getDateInstance(DateFormat.LONG, locale);
        
        System.out.println(dtf.format(date));
    }
*/ 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Locale locale;
        ResourceBundle rb;

        System.out.println("Please choose your language");
        System.out.println("Press 1 for English");
        System.out.println("Press 2 for Hindi");
        System.out.println("Press 3 for Japanese");

        int langChoice = sc.nextInt();
        
        if (langChoice == 1) {
            locale = Locale.of("en", "US");
        } else if (langChoice == 2) {
            locale = Locale.of("hi", "IN");
        } else if (langChoice == 3) {
            locale = Locale.of("jp", "JP");
        } else {
            System.out.println("Invalid Choice. default using English");
            locale = Locale.of("en", "US");
        }
        rb = ResourceBundle.getBundle("ResourceBundle", locale);

        System.out.println(rb.getString("getName"));

        // System.out.println("Enter your name : ");
        sc.nextLine();

        String name = sc.nextLine();
        // System.out.println("Enter your EmpId : ");
        
        System.out.println(rb.getString("getEmpId"));

        String EmpId = sc.nextLine();
        //System.out.println("Enter your Department : ");
        
        System.out.println(rb.getString("getDepartment"));
        String Dept = sc.nextLine();
        //System.out.println("Enter your Basic_Salary : ");
        System.out.println(rb.getString("getSalary"));
        
        int salary = sc.nextInt();

        double hra = 0.25*salary;
        double da = 0.3*salary;
        double ta = 0.2*salary;
        double pf = 0.12*salary;
        
        double tax = 0.0;

        if (salary>=0 && salary< 320000){
            tax = 0;
        }
        else if (salary >320000 && salary <450000) {
            tax = 0.12*salary;
        }
        else if (salary >= 450000 && salary <699999){
            tax = 0.15*salary;
        }
        else if (salary >= 700000 ){
            tax = 0.2*salary;
        }

        System.out.println("Name : "+name);
        
        System.out.println("EmpId : "+EmpId);

        System.out.println("Department : "+Dept);
        
        System.out.println("Basic Pay : "+salary);
        
        System.out.println("HRA : "+hra);
        
        System.out.println("DA : "+da);
        
        System.out.println("TA : "+ta);
        
        System.out.println("PF : "+pf);
        
        double gp = salary+hra+da+ta;

        double np = gp-pf-tax;

        System.out.println("Gross Salary : "+gp);
        
        System.out.println("Net Pay : "+np);

        sc.close();
    }
}
