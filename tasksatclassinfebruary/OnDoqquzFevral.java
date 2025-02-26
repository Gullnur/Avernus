package tasksatclassinfebruary;

import java.util.Scanner;
import java.util.Arrays;

public class OnDoqquzFevral {

    public static void main(String[] args) {
//        books();
//        double total = weeks();
//       points();
//       checkNames();
     //  arrays();
       // copyarray();
        maxAndMin();
    }
        //task 1
    public static void books() {
        String[] books = {"hp1" , "hp2 ", "hp3 ", "hp4 ", "hp5 "};
        for (String book : books) {
            System.out.println(book);
        }
    }
        //task2
    public static double weeks() {
        double[] expenses = {11.1, 22.2, 33.3, 44.4, 55.5, 66.6, 77.7};
        double totalExpenses = 0;

        for (double expense : expenses) {
            totalExpenses += expense;
        }

        System.out.println("Total $ " + totalExpenses);
        return totalExpenses;
    }
        //task3
        public static void points() {
            int[][] studentsPoints = {
                    {40, 50, 60},
                    {70, 80, 90},
                    {100, 90, 80},
                    {70, 60, 50}
            };

            //for ile beledi:

//            for (int i = 0; i < studentsPoints.length; i++) {
//                for (int j = 0; j < studentsPoints[i].length; j++)
//                    System.out.print(studentsPoints[i][j] + " ");
//                System.out.println();}
            // for each ile bele:

            for(int[] matrix1: studentsPoints){
                for(int matrix2: matrix1){
                    System.out.print(matrix2+ " ");
                }
                System.out.println();
            }

        }

        //task 4
        public static String checkNames() {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the name you want to check: ");
            String searchedName = scanner.nextLine();

            String[] names = {"vafa","malak","nuray","nilay"};
            int index = -1;
            for (int i = 0; i < names.length; i++) {
                if (searchedName.equals(names[i])) {
                index = i;
                break;
                }}
                if(index != -1){
                    System.out.println(index);
                }else{
                    System.out.println(index);
                }
            return searchedName;}

        //task 5
        public static void arrays() {
            int[] prices = {250, 100, 450, 300, 150};
            Arrays.sort(prices);
            System.out.println("sorted in ascending ordr: " + Arrays.toString(prices));

            int[] descendingPrices = new int[prices.length];
            for (int i = 0; i < prices.length; i++) {
                descendingPrices[i] = prices[prices.length - 1 - i];
            }
            System.out.println("sorted in descending order: " + Arrays.toString(descendingPrices));
        }


        //task6
        public static void copyarray() {
            int[] orderIDs = {101, 102, 103};
            int[] backupOrders = Arrays.copyOf(orderIDs, orderIDs.length);
            System.out.println(Arrays.toString(backupOrders));
        }
        //task7
        public static void maxAndMin() {
            double[] rainfallData = {12.5, 8.9, 15.6, 10.2, 7.3};
            double minRainfall = Arrays.stream(rainfallData).min().orElse(Double.NaN);
            double maxRainfall = Arrays.stream(rainfallData).max().orElse(Double.NaN);

            System.out.println("Minimum Rainfall: " + minRainfall);
            System.out.println("Maximum Rainfall: " + maxRainfall);
        }
}
