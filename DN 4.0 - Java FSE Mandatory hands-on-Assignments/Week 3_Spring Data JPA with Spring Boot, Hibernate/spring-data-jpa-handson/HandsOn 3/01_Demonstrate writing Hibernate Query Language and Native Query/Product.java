@Entity
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double cpuSpeed;
    private String os;
    private int ram;
    private int storage;
    private double weight;
    private String cpu;
    private double rating;
    // getters/setters...
}
