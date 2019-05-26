import java.util.ArrayList;

public class Exceptional {
  public void testable() {
    ArrayList<Object> list = new ArrayList<Object>();

    list.add("13");
    list.add("hello world");
    list.add(48);
    list.add("Goodbye World");

    for (int i = 0; i < list.size(); i++) {
      try {
        Integer castedValue = (Integer) list.get(i);
        System.out.println(castedValue);

      } catch (ClassCastException e) {
        System.out.println(String.format("The error occurred at index %d", i));
        System.out.println(e.getMessage());
      }

    }

    // System.out.println(String.format("i after the loop :: %d", i));
  }
}
