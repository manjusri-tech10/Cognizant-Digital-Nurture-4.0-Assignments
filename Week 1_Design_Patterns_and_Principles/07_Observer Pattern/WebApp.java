public class WebApp implements Observer {
    public void update(float price) {
        System.out.println("WebApp received stock price: " + price);
    }
}
