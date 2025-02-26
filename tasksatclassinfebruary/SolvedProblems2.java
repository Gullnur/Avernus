package tasksatclassinfebruary;

import java.util.Scanner;


public class SolvedProblems2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] balances = {1000.0, 5000.0, 1500.0};
        int currentAccount = 0;
        boolean loggedIn = true;

        System.out.println("Welcome to the ATM System!");
               // bunu true eledim;
        while (loggedIn) {
            System.out.println("\nPlease log in to continue.");
            System.out.print("Enter your PIN: ");
            String pin = scanner.nextLine();
            if (pin.equals("1234")) {
                System.out.println("Login successful!");
                //break qoydum;
                break;
            } else {
                System.out.println("Incorrect PIN. Please try again.");
            }
        }

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Switch Account");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Your current balance is: $" + balances[currentAccount]);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount <= 0) {
                        System.out.println("Amount should be positive.");
                    } else {
                        //+
                        balances[currentAccount] += depositAmount;
                        System.out.println("Deposited: $" + depositAmount + ". New balance: $" + balances[currentAccount]);
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > balances[currentAccount]) {
                        System.out.println("Insufficient funds. Try again.");
                    } else if (withdrawAmount < 0) {
                        System.out.println("Invalid withdrawal amount.");
                    } else {
                        //-
                        balances[currentAccount] -= withdrawAmount;
                        System.out.println("Withdrew: $" + withdrawAmount + ". New balance: $" + balances[currentAccount]);
                    }
                    break;
                case 4:
                    System.out.print("Enter account number to switch (0-2): ");
                    int accountToSwitch = scanner.nextInt();
                    // 5 in yerine 2
                    if (accountToSwitch < 0 || accountToSwitch > 2) {
                        System.out.println("Invalid account number.");
                    } else {
                        currentAccount = accountToSwitch;
                        System.out.println("Switched to account " + accountToSwitch);
                    }
                    break;
                case 5:
                    System.out.println("Thank you for using the ATM!");
                    //return qoydum
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }



}
