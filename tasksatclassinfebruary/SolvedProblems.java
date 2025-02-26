package tasksatclassinfebruary;
import java.util.Scanner;

    public class SolvedProblems {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            String[] movies = {"Inception", "Interstellar", "The Matrix", "Avatar"};
            boolean bookingConfirmed = false;

            System.out.println("Welcome to the Movie Booking System!");

            while (!bookingConfirmed) {
                System.out.println("\nAvailable Movies:");
                for (String movie : movies) {
                    System.out.println(movie);
                }

                System.out.print("\nEnter the movie name you want to book: ");
                String selectedMovie = scanner.nextLine();


                boolean movieExists = false;
                for (String movie : movies) {
                    //burda string muqayisesi equalsla olur
                    if (movie.equals(selectedMovie)) {
                        movieExists = true;
                        break;
                    }
                }

                if (!movieExists) {
                    System.out.println("Invalid movie selection. Try again.");
                    continue;
                }

                //indexi gostermek ucun
                int index = 0;
                for (int i = 0; i < movies.length; i++) {
                    if (selectedMovie.equals(movies[i])) {
                        index = i;
                        System.out.println(index);
                        break;
                    }
                }

                System.out.print("Enter your age: ");
                int age = scanner.nextInt();
                scanner.nextLine();

                String ticketPrice = (age < 12) ? "$5 (Child Price)" :
                        (age < 18) ? "$8 (Teen Price)" :
                                //morterize baglanmayib
                                "$10 (Adult Price)";

                System.out.println("Ticket Price for " + selectedMovie + ": " + ticketPrice);

                System.out.print("Confirm booking? (yes/no): ");
                String confirmation = scanner.nextLine();

                switch (confirmation.toLowerCase()) {
                    case "yes":
                        System.out.println("Booking confirmed! Enjoy your movie.");
                        bookingConfirmed=true;
                        break;
                    case "no":
                        System.out.println("Booking cancelled.");
                        break;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }

            }

            scanner.close();
        }
    }

