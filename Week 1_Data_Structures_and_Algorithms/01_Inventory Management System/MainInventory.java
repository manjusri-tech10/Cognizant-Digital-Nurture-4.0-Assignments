public class MainInventory {
    public static void main(String[] args) {
        Inventory inv = new Inventory();
        inv.addProduct(new Product(1, "Laptop", 10, 60000));
        inv.updateProduct(1, 12, 58000);
        inv.deleteProduct(1);
    }
}
