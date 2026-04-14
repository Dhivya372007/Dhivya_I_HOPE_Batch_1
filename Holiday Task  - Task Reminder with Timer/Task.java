class Task implements Comparable<Task> {
    String name;
    int time;
    Task(String name, int time) {
        this.name = name;
        this.time = time;
    }
    // Comparable → default sorting (by time)
    public int compareTo(Task t) {
        return this.time - t.time;
    }
}
