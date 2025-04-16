package caffeemarket;


import java.util.ArrayList;

public class Cart<T extends CoffeeProduct> {
    private ArrayList<T> items = new ArrayList<>();


    public void addProduct(T product) {
        items.add(product);
        System.out.println(product.getName() + " added to cart");
    }



    public void removeProductById(int id) {
        items.removeIf(p -> p.getId() == id);
        System.out.println("product removed");
    }



    public void viewCart() {
        if (items.isEmpty()) {
            System.out.println("cart is empty");
            return;
        }


        double total = 0;
        System.out.println("items in cart:  ");
        for (T item : items) {
            System.out.println("-  " + item.getName() + " - $" + item.getPrice());
            total += item.getPrice();
        }
        System.out.println("total:$" + total);
    }


    public double getTotalPrice() {
        double total = 0;
        for (T item : items) {
            total += item.getPrice();
        }
        return total;
    }


    public void clearCart() {
        items.clear();
    }


    public boolean isEmpty() {
        return items.isEmpty();
    }
}
