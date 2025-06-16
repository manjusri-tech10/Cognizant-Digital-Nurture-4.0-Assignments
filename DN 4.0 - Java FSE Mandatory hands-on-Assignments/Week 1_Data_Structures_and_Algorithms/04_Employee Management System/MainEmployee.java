public class MainEmployee {
    public static void main(String[] args) {
        EmployeeManager m = new EmployeeManager();
        m.addEmployee(new Employee(1, "John", "Manager", 75000));
        m.searchEmployee(1);
        m.traverseEmployees();
        m.deleteEmployee(1);
    }
}
