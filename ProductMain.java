import java.util.*;

class Product {
    int pid;
    double price;
     int quantity;

    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
    public int getPid() { return pid; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
}

public class ProductMain {

    // c) total amount spent on all products
    public static double totalAmount(Product[] products) {
        double sum = 0.0;
        for (Product p : products) {
            sum += p.getPrice() * p.getQuantity();
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] items = new Product[5];

        // a) accept five products
        for (int i = 0; i < items.length; i++) {
            System.out.println("Enter pid, price, quantity for product " + (i + 1) + ":");
            int pid = sc.nextInt();
            double price = sc.nextDouble();
            int qty = sc.nextInt();
            items[i] = new Product(pid, price, qty);
        }

        // b) find pid with highest price
        int highestPid = items[0].getPid();
        double highestPrice = items[0].getPrice();
        for (int i = 1; i < items.length; i++) {
            if (items[i].getPrice() > highestPrice) {
                highestPrice = items[i].getPrice();
                highestPid = items[i].getPid();
            }
        }

        System.out.println("PID with highest price: " + highestPid);
        System.out.println("Total amount spent: " + totalAmount(items));
        sc.close();
    }
}
