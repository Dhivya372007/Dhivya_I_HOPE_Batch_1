import java.util.*;

public class TaskManager {
    public static void main(String[] args) {

        List<Task> tasks = new ArrayList<>();

        tasks.add(new Task("Study", 30));
        tasks.add(new Task("Exercise", 10));
        tasks.add(new Task("Sleep", 60));
        Collections.sort(tasks);
        System.out.println("Sorted by Time (Comparable):");
        for (Task t : tasks) {
            System.out.println(t.name + " - " + t.time);
        }
        Collections.sort(tasks, new Comparator<Task>() {
            public int compare(Task a, Task b) {
                return a.name.compareTo(b.name);
            }
        });

        System.out.println("\nSorted by Name (Comparator):");
        for (Task t : tasks) {
            System.out.println(t.name + " - " + t.time);
        }

        Collections.sort(tasks, (a, b) -> b.time - a.time);

        System.out.println("\nSorted by Time Desc:");
        for (Task t : tasks) {
            System.out.println(t.name + " - " + t.time);
        }
    }
}
