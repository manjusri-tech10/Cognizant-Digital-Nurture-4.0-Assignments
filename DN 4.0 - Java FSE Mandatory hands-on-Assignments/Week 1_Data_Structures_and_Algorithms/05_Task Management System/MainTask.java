public class MainTask {
    public static void main(String[] args) {
        TaskManager m = new TaskManager();
        m.addTask(new Task(1, "Write Report", "Pending"));
        m.searchTask(1);
        m.traverseTasks();
        m.deleteTask(1);
    }
}
