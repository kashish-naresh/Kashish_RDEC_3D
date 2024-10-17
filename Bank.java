package Bank_RDEC;
import java.util.Locale;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Bank {
    private String accountHolderName;
    private String accountNumber;
    private double balance;
    private ResourceBundle messages;

    // Constructor to initialize the Bank class with a random account number and balance
    public Bank(double balance, ResourceBundle messages) {
        this.accountNumber = String.format("%013d", new Random().nextLong() & Long.MAX_VALUE); // One-liner for random 13-digit account number
        this.balance = balance;
        this.messages = messages;
    }

    // Set the account holder's name
    public void setAccountHolderName(String name) {
        this.accountHolderName = name;
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(messages.getString("success"));
        } else if (amount <= 0) {
            System.out.println(messages.getString("invalidAmount"));
        } else {
            System.out.println(messages.getString("insufficientFunds"));
        }
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(messages.getString("success"));
        } else {
            System.out.println(messages.getString("invalidAmount"));
        }
    }

    // Method to display the current account details
    public void displayBalance() {
        System.out.println(messages.getString("balance") + " $" + balance);
    }

    // Method to display account details including account number
    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    // Method to create a menu for user interaction
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Determine the locale
        System.out.println("Choose your language (1: English, 2: Hindi, 3: Japanese): ");
        int langChoice = scanner.nextInt();
        //scanner.nextLine();
        Locale locale;

        switch (langChoice) {
            case 2:
                locale = Locale.of("hi", "IN");
                break;
            case 3:
                locale = Locale.of("ja", "JP");
                break;
            default:
                locale = Locale.of("en", "US");
        }

        ResourceBundle messages = ResourceBundle.getBundle("ResourceBundle", locale);

        // Initialize account with default values
        Bank myAccount = new Bank(1000.00, messages);

        // Request account holder's name
        System.out.println(messages.getString("getName"));
        scanner.nextLine(); // consume the newline
        String name = scanner.nextLine();
        myAccount.setAccountHolderName(name);
        System.out.println(messages.getString("greet") + " " + name);

        int choice;
        do {
            System.out.println(messages.getString("service"));
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    myAccount.displayBalance();
                    break;
                case 2:
                    System.out.println(messages.getString("depositAmt"));
                    double depositAmount = scanner.nextDouble();
                    myAccount.deposit(depositAmount);
                    break;
                case 3:
                    System.out.println(messages.getString("depositAmt"));
                    double withdrawAmount = scanner.nextDouble();
                    myAccount.withdraw(withdrawAmount);
                    break;
                default:
                    System.out.println(messages.getString("invalidChoice"));
            }

            System.out.println(messages.getString("continuation"));
        } while (scanner.nextInt() != 0);

        // Display account details before exiting
        myAccount.displayAccountDetails();
        
        scanner.close();
    }
}
