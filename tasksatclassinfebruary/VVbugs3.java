package tasksatclassinfebruary;

import java.util.Scanner;

    public class  VVbugs3{
        static String[] accountHolders = {"Alice", "Bob", "Charlie"};

        //array olculeri duzgun deyil
        static double[] balances = {1000.0, 1500.0,2000.0}; // Error: Array size mismatch

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (true) { // Potential infinite loop
                System.out.println("\nBanking System");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Transfer");
                System.out.println("4. Check Balance");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");

                int choice = scanner.nextInt();
                        //yene breaklar
                switch (choice) {
                    case 1:
                        deposit(scanner);
                        break;
                    case 2:
                        withdraw(scanner);
                        break;
                    case 3:
                        transfer(scanner);
                        break;
                    case 4:
                        checkBalance(scanner);
                        break;
                    // case 5 elave etdim
                    case 5:
                        return;
                    default:
                        System.out.println("Invalid option");
                }
            }
        }

        static void deposit(Scanner scanner) {
            System.out.print("Enter account index (1-3): ");
            int index = scanner.nextInt();

            System.out.print("Enter amount to deposit: ");
            double amount = scanner.nextDouble();

            balances[index - 1] += amount > 0 ? amount : 0; // Error: Does not reject negative amounts properly
            System.out.println("Deposit successful! New Balance: " + balances[index - 1]);
        }

        static void withdraw(Scanner scanner) {
            System.out.print("Enter account index (1-3): ");
            int index = scanner.nextInt();

            System.out.print("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();

            balances[index - 1] -= amount <= balances[index - 1] ? amount : 0; // Error: Allows overdraft without warning
            System.out.println("Withdrawal successful! New Balance: " + balances[index - 1]);
        }

        static void transfer(Scanner scanner) {
            System.out.print("Enter sender account index (1-3): ");
            int sender = scanner.nextInt();
            System.out.print("Enter receiver account index (1-3): ");
            int receiver = scanner.nextInt();

            System.out.print("Enter transfer amount: ");
            double amount = scanner.nextDouble();

            // Error: No check if sender has enough balance
            balances[sender - 1] -= amount;
            balances[receiver - 1] += amount;
            System.out.println("Transfer successful!");
        }

        static void checkBalance(Scanner scanner) {
            System.out.print("Enter account index (1-3): ");
            int index = scanner.nextInt();

            System.out.println("Account Holder: " + accountHolders[index - 1]); // Error: May access undefined index
            System.out.println("Balance: " + balances[index - 1]);
        }
    }

