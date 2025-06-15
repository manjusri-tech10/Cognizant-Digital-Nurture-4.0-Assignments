public class MobileApp implements Observer {
    public void update(float price) {
        System.out.println("MobileApp received stock price: " + price);
    }
}
