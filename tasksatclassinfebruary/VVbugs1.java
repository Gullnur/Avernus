package tasksatclassinfebruary;
import java.util.Scanner;

public class VVbugs1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            //  burda [] isaresi qoymaq lazimdir
            String [] students = {"Alice", "Bob", "Charlie", "David"};

            System.out.println("Enter student index [0-3]: ");
            int index = scanner.nextInt();
// burda 0ci indexide yeni alice'nide nezere almaq ucun >= 0 yazmaq lazimdir




            if (index >= 0 && index <=3) {
                System.out.println("Student: " + students[index]);
                // else ifin icindeki sert operatorun icinde olanda sual meqsedi güdür deye == bele yazilir ve sual verir yoxlayir sonra icra edir
                // bu else if i commentariyaya aldim cunki gereksiz bir uzatma olaraq gordum ondansa yuxarida <3 yazmaq evezi <=3 mene daha mentiqli geldi
//            } else if (index == 3) {
//                System.out.println("Student: " + students[index]);
            }
            else {
                System.out.println("Invalid index!");
            }

            System.out.println("Enter grade (A, B, C, D, F): ");
            char grade = scanner.next().charAt(0);

            switch (grade) {
                case 'A':
                    System.out.println("Excellent!");
                    //break qoydum
                    break;
                case 'B':
                    System.out.println("Good job!");
                    //break qoydum
                    break;
                case 'C':
                    System.out.println("Average.");
                    break;
                case 'D':
                    System.out.println("Pass");
                    break;
                default:
                    System.out.println("Fail");
                    break;
            }


            //obyektin indexleri sehv yazilmisdi onlari duzeltdim

            //burda [3][2] yazilisi deyisdim
            Object[][] studentScores = new Object[4][2];
            studentScores[0][0] = "Alice";
            studentScores[0][1] = 90;

            studentScores[1][0] = "Bob";
            studentScores[1][1] = 85;

            studentScores[2][0] = "Charlie";
            studentScores[2][1] = 78;
            // burda indexi 3 olan davidi de elave etdim
            studentScores[3][0] = "David";
            studentScores[3][1] = 95;

            //burda <= olmaz yalniz ucden kicikdir olur
            for (int i = 0; i < 4; i++) {
                //elave fongu var idi onu sildim iki defe capa verirdi deye
                    System.out.println("Student: " + studentScores[i][0] + ", Score: " + studentScores[i][1]);

            }

            scanner.close();
        }
    }
