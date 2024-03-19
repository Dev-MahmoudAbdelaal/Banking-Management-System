import java.util.*;

public class Main {
    public static void delay() {
        try {
            // Pause execution for 2 seconds
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // Handle any exceptions
            e.printStackTrace();
        }
    }

    public static void printOperations() {
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Show Balance");
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scan = new Scanner(System.in);
        System.out.println("Hi, my friend! Welcome to our bank. ❤️ Let's start a nice journey together. 🚀");
        delay();

        System.out.println("Here we go! 🎉");
        delay();

        System.out.println("Create account");
        System.out.print("please,Enter your name:-");
        String userName = scan.nextLine();
        bank.createAccount(userName);
        System.out.println("Please,Enter the number of the process that you want to do:");
        printOperations();

        try {
            int processId = scan.nextInt();
            switch (processId) {
                case 1:
                    System.out.println("welcome to deposit Operations");
                    delay();
                    Account accountDeposite = bank.getAccount(userName);
                    System.out.println("please Enter Amount that you want to deposite:-");
                    double amountDeposite = scan.nextDouble();
                    accountDeposite.deposit(amountDeposite);
                    break;
                    case 2:
                    Account accountWirhDraw=bank.getAccount(userName);
                    System.out.println("please Enter Amount that you want to withdraw:-");
                    double amountWithDraw=scan.nextDouble();
                    accountWirhDraw.Withdraw(amountWithDraw);
                    break;
                    case 3:
                    Account accountBalance=bank.getAccount(userName);
                    System.out.print("The Balance of your account"+accountBalance.getBalance()+"$");
                default:
                    break;
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }

        scan.close();
    }

}