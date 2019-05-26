public class LinkedListTest {
  public static void main(String[] args) {
    int[] numbers = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
    LinkedList<Integer> list = new LinkedList<Integer>();

    for (int number : numbers) {
      list.addFront(number);
    }
    list.addFront(9999);
    list.addTail(77);
    list.print();

    Node<Integer> node = list.remove();

    System.out.println(node.value);
    list.print();
    list.addTail(777777);

    System.out.println("Finding.....");
    System.out.print((list.find(777777) == null ? "Not found" : "Found") + "\n");
    System.out.println("Finding.....");
    System.out.print((list.find(-7) == null ? "Not found" : "Found") + "\n");

    Node<Integer> removed = list.removeAt(3);
    System.out.println(String.format("Found and removed node with value %d", removed == null ? 99999 : removed.value));
  }
}
