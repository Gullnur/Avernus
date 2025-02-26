package tasksatclassinfebruary;


import java.util.Arrays;
import java.util.Scanner;

public class Exercises2 {
    static final int EMPLOYEE_COUNT = 5;
    static String[] employeeNames = new String[EMPLOYEE_COUNT];
    static double[] salaries = new double[EMPLOYEE_COUNT];
    static String[] departments = new String[EMPLOYEE_COUNT];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input employee details
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.print("Enter employee name: ");
            employeeNames[i] = scanner.nextLine();
            System.out.print("Enter salary: ");
            salaries[i] = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter department: ");
            departments[i] = scanner.nextLine();
        }

        displaySortedEmployees();
        displaySalaryStatistics();

        // Search function
        System.out.print("\nSearch for an employee: ");
        String searchName = scanner.nextLine();
        searchEmployee(searchName);

        // Update salary function
        System.out.print("\nEnter employee name to update salary: ");
        String updateName = scanner.nextLine();
        System.out.print("Enter new salary: ");
        double newSalary = Double.parseDouble(scanner.nextLine());
        updateSalary(updateName, newSalary);

        scanner.close();
    }

    static void displaySortedEmployees() {
        Integer[] indices = new Integer[EMPLOYEE_COUNT];
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, (a, b) -> Double.compare(salaries[b], salaries[a]));

        System.out.println("\nEmployee List (Sorted by Salary - High to Low):");
        for (int i : indices) {
            System.out.println(employeeNames[i] + " - " + departments[i] + " - $" + salaries[i]);
        }
    }

    static void displaySalaryStatistics() {
        double total = Arrays.stream(salaries).sum();
        double average = total / EMPLOYEE_COUNT;
        int maxIndex = 0, minIndex = 0;

        for (int i = 1; i < EMPLOYEE_COUNT; i++) {
            if (salaries[i] > salaries[maxIndex]) maxIndex = i;
            if (salaries[i] < salaries[minIndex]) minIndex = i;
        }

        System.out.printf("\nAverage Salary: $%.2f\n", average);
        System.out.println("Highest Salary: " + employeeNames[maxIndex] + " ($" + salaries[maxIndex] + ")");
        System.out.println("Lowest Salary: " + employeeNames[minIndex] + " ($" + salaries[minIndex] + ")");
    }

    static void searchEmployee(String name) {
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            if (employeeNames[i].equalsIgnoreCase(name)) {
                System.out.println(name + " works in " + departments[i] + " and earns $" + salaries[i] + ".");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    static void updateSalary(String name, double newSalary) {
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            if (employeeNames[i].equalsIgnoreCase(name)) {
                salaries[i] = newSalary;
                System.out.println(name + "'s salary has been updated to $" + newSalary + "!");
                return;
            }
        }
        System.out.println("Employee not found.");
    }
}
