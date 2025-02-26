package tasksatclassinfebruary;

    import java.util.Scanner;

    public class VVbugs2 {
        static String[] books = {"Java Basics", "Data Structures", "Algorithms"};

        //massiv books dan kicik element sayina malikdir deye alinmir
        static boolean[] isBorrowed = {false, false, false};

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("\nLibrary System");
                System.out.println("1. View Books");
                System.out.println("2. Borrow Book");
                System.out.println("3. Return Book");
                System.out.println("4. Exit");
                System.out.print("Enter choice: ");

                int choice = scanner.nextInt();
            //breaklar qoydum
                switch (choice) {
                    case 1:
                        viewBooks();
                        break;
                    case 2:
                        borrowBook(scanner);
                        break;
                    case 3:
                        returnBook(scanner);
                        break;
                    case 4:

                        // break qoyurdum alinmirdi  returnle dayandi niye ki
                        return;
                    default:
                        System.out.println("Invalid option");
                }
            }
        }

        static void viewBooks() {
            // <= olanda alinmir
            for (int i = 0; i < books.length; i++) {
                System.out.println((i+1) + ". " + books[i] + " - " + (isBorrowed[i] ? "Borrowed" : "Available"));
            }
        }



        static void borrowBook(Scanner scanner) {
            System.out.print("Enter book index to borrow (1-3): ");
            int index = scanner.nextInt();
            if (index < 1 || index > books.length) {
                System.out.println("Invalid book selection");
                return;
            }
// 1-den bashlayir, amma massiv 0-dan
            index--;

            if (isBorrowed[index]) {
                System.out.println("Book already borrowed");
            } else {
                //
                isBorrowed[index] = true;
                System.out.println("You borrowed: " + books[index]);
            }
        }




        // burda borrowdan  sonra qariqliq yaranir yene user ucun 0 dan baslamadigi ucun
        //ona gore 1 den baslanmalidir ki user kitabi return ede bilsin yene index-- kimi yazmaliyiq

        static void returnBook(Scanner scanner) {
            System.out.print("Enter book index to return (1-3): ");
            int index = scanner.nextInt();

            if (index < 1 || index > books.length) {
                System.out.println("Invalid book selection");
                return;
            }
                // borrowdaki kimi
            index--;
            if (!isBorrowed[index]) {
                System.out.println("This book was never borrowed");
            } else {
                isBorrowed[index] = false;
                System.out.println("Book returned: " + books[index]);
            }
        }


    }
