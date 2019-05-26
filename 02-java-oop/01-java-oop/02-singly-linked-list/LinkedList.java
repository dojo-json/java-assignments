public class LinkedList<T> {
  public Node<T> head;

  LinkedList() {
    this.head = null;
  }

  public LinkedList<T> addFront(T value) {
    Node<T> node = new Node<T>(value);

    return this.addFront(node);
  }

  public LinkedList<T> addFront(Node<T> node) {
    Node<T> head = this.head;

    node.next = head;
    this.head = node;

    return this;
  }

  public void print() {
    Node<T> current = this.head;

    while (current != null) {
      System.out.println(String.format("The node value is %d", current.value));
      current = current.next;
    }

    System.out.println("Printing list complete");
  }

  public boolean isEmpty() {
    return this.head == null;
  }

  public LinkedList<T> addTail(T value) {
    final Node<T> node = new Node<T>(value);

    return this.addTail(node);
  }

  public LinkedList<T> addTail(Node<T> node) {
    if (this.isEmpty()) {
      return this.addFront(node);
    }

    Node current = this.head;

    while (current.next != null) {
      current = current.next;
    }

    current.next = node;

    return this;
  }

  public int length() {
    int sum = 0;

    Node<T> current = this.head;

    while (current != null) {
      sum++;
      current = current.next;
    }

    return sum;
  }

  public Node<T> remove() {
    if (this.isEmpty()) {
      return null;
    }

    if (this.head.next == null) {
      return this.removeHead();
    }

    Node<T> current = this.head;

    while (current.next.next != null) {
      current = current.next;
    }

    Node<T> removed = current.next;
    current.next = null;

    return removed;
  }

  private Node<T> removeHead() {
    Node<T> head = this.head;
    Node<T> next = head != null ? head.next : head;
    this.head = next;
    return head;
  }

  public Node<T> find(T value) {
    if (this.isEmpty()) {
      return null;
    }

    System.out.println("Attempting to find '" + value.toString() + "'");

    Node<T> current = this.head;

    while (current != null) {
      if (current.equals(value)) {
        return current;
      }

      current = current.next;
    }

    return current;
  }

  public Node<T> removeAt(int n) {
    if (n < 0) {
      return null;
    }

    if (n == 0) {
      return this.removeHead();
    }

    Node<T> runner = this.head;

    while (runner.next != null && runner.next.next != null && --n > 0) {
      runner = runner.next;
      // n--;
    }

    if (n > 0) {
      return null;
    }

    Node<T> next = runner.next;
    runner.next = next.next;

    return next;
  }
}
