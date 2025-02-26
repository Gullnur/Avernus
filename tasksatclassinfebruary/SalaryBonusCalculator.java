package tasksatclassinfebruary;

import java.util.Scanner;

public class SalaryBonusCalculator {

    public static double getBonusPercentage(String position) {
        double bonusPercentage = 0;
        switch (position.toLowerCase()) {
            case "manager":
                bonusPercentage = 0.20; // burda 20% bonus hesablamaqdi
                break;
            case "developer":
                bonusPercentage = 0.10;
                break;
            case "intern":
                bonusPercentage = 0.05;
                break;
            default:
                System.out.println("Yanlış vəzifə daxil edildi!");
        }
        return bonusPercentage;
    }

    public static double calculateTotalSalary(double baseSalary, double bonusPercentage) {
        return baseSalary + (baseSalary * bonusPercentage);
    }

    public static void displaySalaryMessage(double totalSalary) {
        if (totalSalary > 10000) {
            System.out.println("High salary!");
        } else if (totalSalary >= 5000 && totalSalary <= 10000) {
            System.out.println("Good salary!");
        } else {
            System.out.println("Keep working hard!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your job position (Manager, Developer, Intern): ");
        String position = scanner.nextLine();

        System.out.println("Enter your base salary: ");
        int baseSalary = scanner.nextInt();
        double bonusPercentage = (baseSalary > 0) ? getBonusPercentage(position) : 0;

        if (bonusPercentage == 0) {
            System.out.println("Invalid salary entered. Please provide a positive salary.");
            return;
        }

        double totalSalary = calculateTotalSalary(baseSalary, bonusPercentage);

        displaySalaryMessage(totalSalary);

        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Bonus Percentage: " + (bonusPercentage * 100) + "%");
        System.out.println("Total Salary: " + totalSalary);
    }
}
