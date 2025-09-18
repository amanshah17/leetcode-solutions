class TaskManager {
    private static class Task {
        int priority;
        int taskId;
        int userId;
        Task(int p, int t, int u) { priority = p; taskId = t; userId = u; }
    }

    private PriorityQueue<Task> pq;
    private Map<Integer, int[]> taskMap; 

    public TaskManager(List<List<Integer>> tasks) {
        pq = new PriorityQueue<>((a, b) -> {
            if (a.priority == b.priority) return Integer.compare(b.taskId, a.taskId);
            return Integer.compare(b.priority, a.priority);
        });
        taskMap = new HashMap<>();
        for (List<Integer> t : tasks) add(t.get(0), t.get(1), t.get(2));
    }

    public void add(int userId, int taskId, int priority) {
        taskMap.put(taskId, new int[]{userId, priority});
        pq.add(new Task(priority, taskId, userId));
    }

    public void edit(int taskId, int newPriority) {
        int[] cur = taskMap.get(taskId);
        if (cur == null) return;
        int userId = cur[0];
        taskMap.put(taskId, new int[]{userId, newPriority});
        pq.add(new Task(newPriority, taskId, userId)); 
    }

    public void rmv(int taskId) {
        taskMap.remove(taskId); 
    }

    public int execTop() {
        while (!pq.isEmpty()) {
            Task top = pq.poll();
            int[] cur = taskMap.get(top.taskId);
            if (cur != null && cur[0] == top.userId && cur[1] == top.priority) {
                taskMap.remove(top.taskId); 
                return top.userId;
            }
        }
        return -1;
    }
}

/**
 * Your TaskManager object will be instantiated and called as such:
 * TaskManager obj = new TaskManager(tasks);
 * obj.add(userId,taskId,priority);
 * obj.edit(taskId,newPriority);
 * obj.rmv(taskId);
 * int param_4 = obj.execTop();
 */