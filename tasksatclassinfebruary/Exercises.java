package tasksatclassinfebruary;
import java.util.Arrays;
import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {

        task1();
        task2();
    }

    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        int[] grades = new int[5];

        System.out.println("enter your points:");
        for (int i = 0; i < grades.length; i++) {
            while (true) {
                System.out.print((i + 1) + ". point: ");
                int grade = scanner.nextInt();
                if (grade >= 0 && grade <= 100) {
                    grades[i] = grade;
                    break;
                } else {
                    System.out.println("Include a number between [1, 100] ");
                }
            }
        }
        scanner.close();
        double average = Arrays.stream(grades).average().orElse(0);
        int maxGrade = Arrays.stream(grades).max().orElse(0);
        int minGrade = Arrays.stream(grades).min().orElse(0);
        System.out.println("\n your points: " + Arrays.toString(grades));
        System.out.println("ededi orta: " + average);
        System.out.println("max: " + maxGrade);
        System.out.println("min: " + minGrade);
        Arrays.sort(grades);
        System.out.println("filtered points: " + Arrays.toString(grades));
    }


    public static void task2() {
        Scanner sc = new Scanner(System.in);

        String[] employeeNames = new String[3];
        double[] salaries =  new double[3];
        String[] departments = new String[3];

        System.out.println("enter emp names:");

        for (int i = 0; i < employeeNames.length; i++) {
            int empName = sc.nextInt();
            System.out.println(empName);

        }
    }



 }

