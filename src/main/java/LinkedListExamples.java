import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExamples {

  public static void main(String[] args) {

    LinkedList<String> shoppingList = new LinkedList<>();
    shoppingList.add("Apple");
    shoppingList.add("Banana");
    shoppingList.add("Pear");
    System.out.println(shoppingList);

    shoppingList.add(1, "Mango"); // O(n)
    System.out.println(shoppingList);
    // Linked lists are quicker for adding and deleting elements
    // Array lists are quicker for randomly accessing elements -> O(1)

    // Linked lists are slower for randomly accessing elements -> O(n)
    // Array lists are slower for adding and deleting elements -> O(n)

    shoppingList.removeFirst(); // O(1)
    System.out.println(shoppingList);

    List<String> synchronizedShoppingList = Collections.synchronizedList(shoppingList); // copy of the shopping list, but thread safe
    System.out.println(synchronizedShoppingList);
  }

}
