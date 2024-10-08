package Week_2.Collections.OrderTracking;



import java.util.LinkedList;

public class OrderTracking {
    private LinkedList<Order> orders;

    public OrderTracking() {
        orders = new LinkedList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order processOrder() {
        return orders.pollFirst();
    }

    public void displayOrders() {
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
