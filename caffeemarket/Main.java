package caffeemarket;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<CoffeeProduct> products = new ArrayList<>();

        products.add(new CoffeeProduct(1, "espresso", 3.50));
        products.add(new CoffeeProduct(2, "latte", 4.00));
        products.add(new CoffeeProduct(3, "cappuccino", 4.20));

        Customer customer = new Customer(1, "niggar", "niggar@example.com");

        Cart<CoffeeProduct> cart = new Cart<>();

        System.out.println("welcome to CaffeeMarket <3 " + customer.getName() + "!!");

        boolean exit = false;

        while (!exit) {
            System.out.println("\n~~ MENU ~~");
            System.out.println("1.view products");
            System.out.println("2.add product to cart");
            System.out.println("3.remove Product from cart");
            System.out.println("4.view cart");
            System.out.println("5.place order");
            System.out.println("6.exit");
            System.out.print("choose an option: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        System.out.println("\nAvailable Coffee:");
                        for (CoffeeProduct p : products) {
                            System.out.println(p);
                        }
                        break;

                    case 2:
                        System.out.print("enter product ID to add: ");
                        int addId = Integer.parseInt(scanner.nextLine());
                        CoffeeProduct toAdd = findProductById(products, addId);
                        if (toAdd != null) {
                            cart.addProduct(toAdd);
                        } else {
                            System.out.println("product not found");
                        }
                        break;

                    case 3:
                        System.out.print("enter product id to remove: ");
                        int removeId = Integer.parseInt(scanner.nextLine());
                        cart.removeProductById(removeId);
                        break;

                    case 4:
                        cart.viewCart();
                        break;

                    case 5:
                        if (cart.isEmpty()) {
                            System.out.println("cart is empty");
                        } else {
                            cart.viewCart();
                            System.out.println("order placed, dhenk uu!");
                            cart.clearCart();
                        }
                        break;

                    case 6:
                        exit = true;
                        System.out.println("BYEEs");
                        break;

                    default:
                        System.out.println("invalid option pls try again");
                }

            } catch (NumberFormatException e) {
                System.out.println("invalid input ppleaseei enter a number");
            }
        }

        scanner.close();
    }

    public static CoffeeProduct findProductById(ArrayList<CoffeeProduct> products, int id) {
        for (CoffeeProduct p : products) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
}

