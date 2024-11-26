package javaLU.Enum;

import java.util.*;

//Iterator Exercise too
//Comparator Exercise too

class test {
    public static void main(String[] args) {
        Order order1 = new Order(5, 1, OrderStatus.PENDING);
        OrderManager.orderInfo(order1);
        int result = order1.compareTo(new Order(5,5,OrderStatus.DELIVERED));


        OrderManager manager = new OrderManager();
        manager.addOrder(new Order(1, 100,  OrderStatus.PENDING));
        manager.addOrder(new Order(2, 150,  OrderStatus.DISPATCHED));
        manager.addOrder(new Order(3, 200,  OrderStatus.DELIVERED));


        for(Order order : manager) {
           OrderManager.orderInfo(order);
        }

        Iterator<Order> iterator = manager.iterator();
        while(iterator.hasNext()){
            OrderManager.orderInfo(iterator.next());
        }

        //v1
        manager.getOrders().sort(new OrderPriceComparator());

        //v2
        manager.getOrders().sort((o1,o2) -> Integer.compare(o1.getWeight(),o2.getWeight()));
        manager.getOrders().sort(Comparator.comparingInt(Order::getWeight));//same



    }
}
class OrderPriceComparator implements Comparator<Order>{
    @Override
    public int compare(Order o1, Order o2) {
        return o1.getPrice()-o2.getPrice();
    }
}

public enum OrderStatus {
    PENDING,
    DISPATCHED,
    DELIVERED;
}

class OrderManager implements Iterable<Order> {
    private List<Order> orders = new ArrayList<>();

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    @Override
    public Iterator<Order> iterator() {
        return new OrdersIterator();
    }

    public class OrdersIterator implements Iterator {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            if (orders.size() > currentIndex) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public Order next() {
            if (hasNext()) {
                return orders.get(currentIndex++);
            } else {
                throw new NoSuchElementException();
            }
        }
    }


    //TODO
    //addOrder
    //getOrderById
    //deleteOrderById
    //getAllPendingOrdersInPeriod
    //getAllDeliveredOrdersInPeriod
    //getAllDispatchedOrdersInPeriod

    public OrderManager(List<Order> orders) {
        this.orders = orders;
    }

    public OrderManager() {
    }

    public static void orderInfo(Order order) {
        System.out.println("Price: " + order.getPrice());
        System.out.println("Weight: " + order.getWeight());
        switch (order.getStatus()) {
            case PENDING:
                System.out.println("Order is still not sent.");
                break;
            case DISPATCHED:
                System.out.println("Order is in process of delivery.");
                break;
            case DELIVERED:
                System.out.println("Order is delivered successfully.");
                break;
            default:
                System.out.println("Incorrect order status");

        }
    }
}

class Order implements Comparable<Order>{
    private int price;
    private int weight;
    private OrderStatus status;

    public Order(int price, int weight, OrderStatus status) {
        this.price = price;
        this.weight = weight;
        this.status = status;
    }

    @Override
    public int compareTo(Order other) {
        return Integer.compare(this.price, other.price);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
