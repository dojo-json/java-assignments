public class Node<T> {
  public T value;
  public Node<T> next;

  public Node(T value) {
    this.value = value;
    this.next = null;
  }

  @Override
  public boolean equals(Object compareValue) {
    return this.value.equals(compareValue);
  }
}
