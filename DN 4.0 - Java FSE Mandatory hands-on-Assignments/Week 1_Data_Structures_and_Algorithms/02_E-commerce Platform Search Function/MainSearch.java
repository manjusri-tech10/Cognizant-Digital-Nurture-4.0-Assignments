import java.util.Arrays;
public class MainSearch {
    public static void main(String[] args) {
        Product[] products = {
                new Product(1, "Phone", "Electronics"),
                new Product(2, "Shirt", "Apparel"),
                new Product(3, "Laptop", "Electronics")
        };

        Arrays.sort(products, (a, b) -> a.productName.compareTo(b.productName));
        SearchEngine s = new SearchEngine();

        int linearResult = s.linearSearch(products, "Laptop");
        int binaryResult = s.binarySearch(products, "Shirt");

        System.out.println("Linear Search: Found at index " + linearResult);
        System.out.println("Binary Search: Found at index " + binaryResult);
    }
}
