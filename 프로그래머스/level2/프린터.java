package workspace;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class 프린터 {
    static int answer;
    static int topPriority;
    static Queue<Task> queue = new LinkedList<>();
    public static int solution(int[] priorities, int location) {
        addToQueue(priorities);
        int turn = 1;
        while (!queue.isEmpty()) {
            renewPriority();
            sortByPriority();
            Task task = queue.poll();
            if(task.location == location) {
                answer = turn;
                return turn;
            }
            turn++;
        }
        return turn;
    }

    static void addToQueue(int[] priorities) {
        int position = 0;
        for (int priority : priorities) {
            Task task = new Task();
            task.location = position++;
            task.priority = priority;
            if(topPriority < priority) topPriority = priority;
            queue.offer(task);
        }
    }


    private static void renewPriority() {
        topPriority = 0;
        Iterator<Task> iterator = queue.iterator();
        while (iterator.hasNext()) {
            Task task = iterator.next();
            if (topPriority < task.priority) {
                topPriority = task.priority;
            }
        }
    }

    private static void sortByPriority() {
        while (queue.peek().priority != topPriority) {
            Task task = queue.poll();
            queue.offer(task);
        }
    }

    public static void main(String[] args) {
        int[] priorities = new int[]{3,3,4,2};
        int location = 3;
        solution(priorities, location);
        System.out.println("answer = " + answer);
    }

    static class Task {
        int location;
        int priority;
    }
}
