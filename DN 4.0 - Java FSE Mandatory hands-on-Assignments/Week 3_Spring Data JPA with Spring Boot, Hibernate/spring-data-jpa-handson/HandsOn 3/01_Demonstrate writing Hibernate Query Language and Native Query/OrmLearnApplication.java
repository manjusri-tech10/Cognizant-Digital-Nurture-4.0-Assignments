@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired private EmployeeService empSvc;
    @Autowired private AttemptService attSvc;
    @Autowired private JpaCriteriaFilter filter;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) {
        testEmployeeFlows();
        testQuizAttempt();
        testProductFilter();
    }

    public void testProductFilter() {
        Map<String,Object> criteria = Map.of(
            "minRam",8,
            "maxWeight",2.5,
            "os","Windows",
            "minCpuSpeed",2.5,
            "minRating",4.0
        );
        var prods = filter.filterProducts(criteria);
        System.out.println("Filtered products count: " + prods.size());
    }
}
