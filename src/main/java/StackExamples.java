import java.util.ArrayDeque;
import java.util.Deque;

public class StackExamples {

  public static void main(String[] args) {
    // Stack is not recommended
    Deque<String> stack = new ArrayDeque<>(); // NOT THREAD-SAFE, but its much faster than Stack
    // when we push to Deque the element gets put at index 0 and the others are shifted to right
    // For Stack the behavior is the opposite => so it's more like a Queue
    stack.push("First request");
    stack.push("2nd request");
    stack.push("3rd request");
    System.out.println(stack);

    // peek
    System.out.println(stack.peek());
    stack.pop(); // removes the first element; throws NoSuchElementException on an empty stack (Deque)
    System.out.println(stack);

    stack.poll(); // removes the first element of the stack, or returns null if stack is empty
    System.out.println(stack);
    stack.pop();
    stack.pop();

  }

}
