package tasksatclassinfebruary;
 /*
        //task 1.1
import java.util.Scanner;

        System.out.println("welcome to cinema ticket order ");
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter your age: ");
        int userAge = scanner.nextInt();
        if (userAge<12){
            System.out.println("you have to pay 5 $.");
        } else if (userAge>=12 && userAge<=60) {
            System.out.println("you have to pay 10 $.");
        }else {
            System.out.println("you have to pay 7 $.");
        }
*/

public class OnIkiFevral {
    public static void main(String[] args) {


//        checkAge(20);
//        checkBalance(200, 300);
//        checkWeather(40);
//        snackVendingMachine(3);
//        checkTrafficLight("yellow");
//        ternaryOperator(20);



    }

    public static void checkAge(int userAge) {
        if (userAge < 12) {
            System.out.println("you have to pay 5 $!");
        } else if (userAge>12 && userAge<60) {
            System.out.println("you have to pay 10 $.");
        }else{
            System.out.println("you have to pay 7 $.");
        }
    }

    public static void checkBalance(int usersBalance, int usersPayment) {
        if (usersBalance > usersPayment ) {
            System.out.println("Purchase successful!");
        }else{
            System.out.println("Insufficient funds!");
        }
    }

    public static void checkWeather(int weather) {
        if (weather<10){
            System.out.println("wear a jacket and gloves,if you want :D");
        } else if (weather>10 && weather<20) {
            System.out.println("wear a light sweater,if you want :D");
        }else {
            System.out.println("wear T-shirt and sunglasses,if you want :D");
        }
    }

    public static void snackVendingMachine(int number) {
        switch (number) {
            case 1:
                System.out.println("Chips");
                break;
            case 2:
                System.out.println("Chocolate");
                break;
            case 3:
                System.out.println("Soda");
                break;
            case 4:
                System.out.println("Cookies");
                break;
            case 5:
                System.out.println("Juice");
                break;
            default:
                System.out.println("Please enter a number between 1 and 5.");
        }
    }

    public static void checkTrafficLight(String light) {
        if(light=="green"){
            System.out.println("Go!");
        } else if (light=="yellow") {
            System.out.println("Slow down!");
        }else{
            System.out.println("Stop!");
        }
    }

    public static void ternaryOperator(int userrage) {
        String result = (userrage > 18) ? "Eligible to vote!" : (userrage < 18) ? "Not eligible to vote yet!" : "enter the positive number";
        System.out.println(result);
    }


}
