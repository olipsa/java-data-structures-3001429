import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamples {

  public static void main(String[] args) {

    Queue<String> queue = new ArrayDeque<>(); // could also use LinkedList, but ArrayDeque has better performance
    Queue<String> priorityQueue = new PriorityQueue<>(); // The priority is the alphabetical order of elements

    // Adds elements at the end of the array (queue)
    queue.offer("Person1");
    priorityQueue.offer("Person One");
    queue.offer("Person2");
    priorityQueue.offer("Person Two");
    queue.offer("Person3");
    priorityQueue.offer("Person Three");
    System.out.println(queue);
    System.out.println(priorityQueue);

    System.out.println(queue.peek()); // returns the 1st element (the head of the queue)

    queue.poll(); // removes 1st element
    priorityQueue.poll(); // removes 1st element and processes elements based on priority/alphabetical order
    System.out.println(queue);
    System.out.println(priorityQueue);

  }

}
