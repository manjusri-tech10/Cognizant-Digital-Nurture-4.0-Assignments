public class MainSort {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(1, "A", 2500),
            new Order(2, "B", 1500),
            new Order(3, "C", 3000)
        };
        OrderSorter sorter = new OrderSorter();
        sorter.bubbleSort(orders);
        sorter.quickSort(orders, 0, orders.length - 1);
    }
}
