public class TaskManager {
    Task head;

    public void addTask(Task task) {
        task.next = head;
        head = task;
    }

    public Task searchTask(int id) {
        Task curr = head;
        while (curr != null) {
            if (curr.taskId == id) return curr;
            curr = curr.next;
        }
        return null;
    }

    public void traverseTasks() {
        Task curr = head;
        while (curr != null) {
            System.out.println(curr.taskName);
            curr = curr.next;
        }
    }

    public void deleteTask(int id) {
        Task curr = head, prev = null;
        while (curr != null) {
            if (curr.taskId == id) {
                if (prev == null) head = curr.next;
                else prev.next = curr.next;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }
}
